package com.toures.usuario.negocio.servicio;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toures.usuario.persistencia.repositorio.TipoUsuarioRepositorio;
import com.toures.usuario.rest.modelos.TipoUsuarioModelo;

@Service
public class TipoUsuarioServicio {
	@Autowired
	private TipoUsuarioRepositorio tipoUsuarioRepo;

	public List<TipoUsuarioModelo> consultarTiposUsuario() {
		return tipoUsuarioRepo.findAll().stream().map(v -> new TipoUsuarioModelo(v)).collect(Collectors.toList());

	}
}
