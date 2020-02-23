package com.toures.usuario.rest.controlador;

import com.toures.usuario.negocio.servicio.UsuarioServicio;
import com.toures.usuario.rest.modelos.UsuarioModelo;
import com.toures.usuario.rest.values.UsuarioValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Void> createUser(@RequestBody UsuarioModelo usuario) {
        usuarioServicio.crearUsuario(new UsuarioValue(usuario));
        return ResponseEntity.ok().build();
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioModelo> getUser(@RequestParam(required = false) Integer id,
                                                 @RequestParam(required = false) Integer idTipoDocumento,
                                                 @RequestParam(required = false) Long documento){
        return ResponseEntity.ok(usuarioServicio.buscarUsuario(id,idTipoDocumento,documento));
    }


}
