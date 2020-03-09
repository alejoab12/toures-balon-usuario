package com.toures.usuario.negocio.servicio;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.toures.usuario.excepcion.RestServiceException;
import com.toures.usuario.persistencia.entidad.Autenticacion;
import com.toures.usuario.persistencia.repositorio.AutenticacionRepositorio;
import com.toures.usuario.rest.modelos.AutenticacionModelo;

@Service
public class AutenticacionServicio {

	@Autowired
	private AutenticacionRepositorio autenticacionRepositorio;
	@Value("${userNotFoundMessage}")
	private String userNotFound;

	public AutenticacionModelo validarUsuario(String correo, String nombreUsuario) {
		Autenticacion autenticacion=autenticacionRepositorio.buscarPorUsuarioOCorreo(
				Objects.nonNull(nombreUsuario) ? nombreUsuario.toUpperCase() : null,
				Objects.nonNull(correo) ? correo.toUpperCase() : null);
		if(Objects.isNull(autenticacion)) {
			 throw new RestServiceException(404,userNotFound);
		}
		return new AutenticacionModelo(autenticacion);
	}

}
