package com.toures.usuario.negocio.servicio;

import java.sql.Timestamp;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.toures.usuario.persistencia.entidad.Autenticacion;
import com.toures.usuario.persistencia.entidad.TipoDocumento;
import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.persistencia.repositorio.AutenticacionRepositorio;
import com.toures.usuario.persistencia.repositorio.UsuarioRepositorio;
import com.toures.usuario.rest.modelos.UsuarioModelo;

@Service
public class UsuarioServicio {
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private AutenticacionRepositorio autenticacionRepositorio;
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	public void crearUsuario(UsuarioModelo userModel) {
		Usuario usuario = userModel.toEntity();
		Autenticacion autenticacion = new Autenticacion();
		autenticacion.setActivo((short) 1);
		autenticacion.setContrasena(passwordEncode.encode(userModel.getContrasena()));
		autenticacion.setUsuarioId(usuario);
		autenticacion.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
		usuarioRepositorio.saveAndFlush(usuario);
		autenticacionRepositorio.saveAndFlush(autenticacion);
	}

	public UsuarioModelo buscarUsuario(Integer id, Integer tipoDocumento, String documento) {
		UsuarioModelo usuarioModelo = null;

		if (Objects.nonNull(id)) {
			usuarioModelo = new UsuarioModelo(this.usuarioRepositorio.findById(id).get());

		} else if (Objects.nonNull(tipoDocumento) && Objects.nonNull(documento)) {
			usuarioModelo = new UsuarioModelo(
					usuarioRepositorio.findByDocumentoAndTipoDocumentoId(documento, new TipoDocumento(tipoDocumento)));
		}

		return usuarioModelo;
	}
}
