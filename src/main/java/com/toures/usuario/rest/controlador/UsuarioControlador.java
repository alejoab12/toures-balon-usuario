package com.toures.usuario.rest.controlador;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toures.usuario.negocio.servicio.UsuarioServicio;
import com.toures.usuario.rest.modelos.UsuarioModelo;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServicio;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> createUser(@Valid @RequestBody UsuarioModelo usuario) {
		usuarioServicio.crearUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<UsuarioModelo> getUser(@RequestParam(required = false) String id,
			@RequestParam(required = false) Integer idTipoDocumento, @RequestParam(required = false) String documento) {
		return ResponseEntity.ok(usuarioServicio.buscarUsuario(id, idTipoDocumento, documento));
	}

}
