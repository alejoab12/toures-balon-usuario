package com.toures.usuario.rest.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toures.usuario.negocio.servicio.AutenticacionServicio;
import com.toures.usuario.rest.modelos.AutenticacionModelo;

@RestController
@RequestMapping("/autenticacion")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AutenticacionControlador {
	@Autowired
	private AutenticacionServicio autenticacionServicio;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<AutenticacionModelo> validacionUsuario(@RequestParam(required = false) String nombreUsuario,
			@RequestParam(required = false) String correo) {
		return ResponseEntity.ok(autenticacionServicio.validarUsuario(correo, nombreUsuario));
	}
}
