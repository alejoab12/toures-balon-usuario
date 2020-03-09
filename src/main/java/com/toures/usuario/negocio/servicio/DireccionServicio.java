package com.toures.usuario.negocio.servicio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.persistencia.repositorio.DireccionRepositorio;
import com.toures.usuario.rest.modelos.DireccionModelo;

@Service
public class DireccionServicio {
	@Autowired
	private DireccionRepositorio direccionRepositorio;

	public List<DireccionModelo> buscarDireccionesPorIdCliente(Integer idCliente) {
		return direccionRepositorio.findByUsuarioId(new Usuario(idCliente)).stream().map(d -> new DireccionModelo(d))
				.collect(Collectors.toList());
	}

	public void crearDireccion(DireccionModelo direccionModelo) {
		direccionRepositorio.saveAndFlush(direccionModelo.toEntity());
	}
}
