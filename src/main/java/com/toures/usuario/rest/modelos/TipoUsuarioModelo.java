package com.toures.usuario.rest.modelos;

import com.toures.usuario.persistencia.entidad.TipoUsuario;

import lombok.Data;

@Data
public class TipoUsuarioModelo {
	private Integer id;
	private String nombre;

	public TipoUsuarioModelo() {
	}

	public TipoUsuarioModelo(TipoUsuario tipoUsuario) {
		this.id = tipoUsuario.getId();
		this.nombre = tipoUsuario.getNombre();
	}
}
