package com.toures.usuario.rest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toures.usuario.negocio.servicio.TipoUsuarioServicio;
import com.toures.usuario.rest.modelos.TipoUsuarioModelo;

@RestController
@RequestMapping("/tipo-usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TipoUsuarioControlador {

	@Autowired
	private TipoUsuarioServicio tipoUsuarioServicio;
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TipoUsuarioModelo>> getUser() {
		return ResponseEntity.ok(tipoUsuarioServicio.consultarTiposUsuario());
	}

}
