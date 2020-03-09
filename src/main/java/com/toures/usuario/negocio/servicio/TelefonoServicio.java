package com.toures.usuario.negocio.servicio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.usuario.persistencia.repositorio.TelefonoRepositorio;
import com.toures.usuario.rest.modelos.TelefonoModelo;

@Service
public class TelefonoServicio {
	@Autowired
	private TelefonoRepositorio telefonoRepositorio;

	public List<TelefonoModelo> buscarTelefonoPorIdCliente(Integer idCliente) {
		return telefonoRepositorio.findByUsuarioId(idCliente).stream().map(t -> new TelefonoModelo(t))
				.collect(Collectors.toList());
	}

	public void crearTelefono(TelefonoModelo telefonoModelo) {
		telefonoRepositorio.saveAndFlush(telefonoModelo.toEntity());
	}
}
