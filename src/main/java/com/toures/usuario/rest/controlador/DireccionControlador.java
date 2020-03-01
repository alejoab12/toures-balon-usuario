package com.toures.usuario.rest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toures.usuario.negocio.servicio.DireccionServicio;
import com.toures.usuario.rest.modelos.DireccionModelo;
import com.toures.usuario.rest.values.DireccionValue;

@RestController
@RequestMapping("/usuario/direccion")
public class DireccionControlador {
	@Autowired
	private DireccionServicio direccionServicio;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE })
	public ResponseEntity<List<DireccionModelo>> buscarDireccionPorIdCliente(@RequestParam Integer idCliente) {
		return ResponseEntity.ok(this.direccionServicio.buscarDireccionesPorIdCliente(idCliente));
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> crearDireccionEnCliente(@RequestBody DireccionModelo direccionModelo) {
		this.direccionServicio.crearDireccion(new DireccionValue(direccionModelo));
		return ResponseEntity.ok().build();
	}
}
