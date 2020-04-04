package com.toures.usuario.rest.modelos;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.toures.usuario.persistencia.entidad.Autenticacion;

import lombok.Data;

@Data
public class AutenticacionModelo {
	@NotNull
	@Length(min = 6, max = 16,message = "password invalid")
	private String contrasena;
	private UsuarioModelo usuario;

	public AutenticacionModelo(Autenticacion autenticacion) {
		this.contrasena = autenticacion.getContrasena();
		this.usuario = new UsuarioModelo(autenticacion.getUsuarioId());
	}

	public AutenticacionModelo() {
		super();
	}

}
