package com.toures.usuario.rest.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario/telefono")
public class TelefonoControlador {
	@GetMapping
	public ResponseEntity<Void> getInfoTelefono(Integer idCliente) {
		return ResponseEntity.ok().build();

	}
}
