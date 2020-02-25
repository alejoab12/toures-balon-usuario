package com.toures.usuario.rest.controlador;

import com.toures.usuario.negocio.servicio.AutenticacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario/autenticacion")
public class AutenticacionControlador {
    @Autowired
    private AutenticacionServicio autenticacionServicio;
    @PostMapping
    public ResponseEntity<Void> validacionUsuario(@RequestParam(required = false) String nombreUsuario,
                                                  @RequestParam(required = false) String correo,
                                                  @RequestParam String password){
        return autenticacionServicio.validarUsuario(correo,nombreUsuario,password);
    }
}
