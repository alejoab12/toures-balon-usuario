package com.toures.usuario.negocio.servicio;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.toures.usuario.componente.MD5;
import com.toures.usuario.persistencia.entidad.Autenticacion;
import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.persistencia.repositorio.AutenticacionRepositorio;
import com.toures.usuario.persistencia.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

@Service
public class AutenticacionServicio {

    @Autowired
    private AutenticacionRepositorio autenticacionRepositorio;
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private MD5 md5;

    public ResponseEntity<Void> validarUsuario(String correo, String nombreUsuario, String password) {
        ResponseEntity responseEntity = null;
        Usuario usuario = usuarioRepositorio.findByNombreUsuarioOrCorreo(nombreUsuario, correo);
        if (Objects.isNull(usuario)) {
            responseEntity = ResponseEntity.status(401).build();
        } else {
            String cifrado=md5.cifrar(password);
            System.out.println("-".concat(cifrado).concat("-"));
            Autenticacion autenticacion = autenticacionRepositorio.buscarPorUsuarioYContrasena(usuario, cifrado);
            Autenticacion aut2=autenticacionRepositorio.findByUsuarioIdAndActivo(usuario,(short)1);
            System.out.println(aut2);
            if (Objects.isNull(autenticacion)) {
                responseEntity = ResponseEntity.status(401).build();
            } else {
                responseEntity=ResponseEntity.ok().header("Authorization","Authorization",
                        "Bearer ".concat(generarJWT(usuario))).build();
            }
        }
        return responseEntity;
    }

    private String generarJWT(Usuario usuario){
        String token=null;
        try {
            Algorithm algorithm = Algorithm.HMAC256("toures-balon-token");
            token = JWT.create()
                    .withIssuer("toures")
                    .withExpiresAt(new Date(System.currentTimeMillis()+600000))//se expira el token en 10 minutos
                    .withClaim("idUsuario",usuario.getId())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            exception.printStackTrace();
        }
        return token;
    }
}
