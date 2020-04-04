package com.toures.usuario.rest.controlador;

import java.util.List;

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

import com.toures.usuario.negocio.servicio.TelefonoServicio;
import com.toures.usuario.rest.modelos.TelefonoModelo;

@RestController
@RequestMapping("/usuario/telefono")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TelefonoControlador {
	@Autowired
	private TelefonoServicio telefonoServicio;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<TelefonoModelo>> getInfoTelefonos(@RequestParam String idCliente) {
		return ResponseEntity.ok(telefonoServicio.buscarTelefonoPorIdCliente(idCliente));
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> crearTelefonoCliente(@Valid @RequestBody TelefonoModelo telefonoModelo) {
		this.telefonoServicio.crearTelefono(telefonoModelo);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
