package com.toures.usuario.rest.modelos;

import com.toures.usuario.persistencia.entidad.Autenticacion;

import lombok.Data;

@Data
public class AutenticacionModelo {
	private String contrasena;
	private UsuarioModelo usuario;
	public AutenticacionModelo(Autenticacion autenticacion) {
		this.contrasena=autenticacion.getContrasena();
		this.usuario=new UsuarioModelo(autenticacion.getUsuarioId());
	}
	public AutenticacionModelo() {
		super();
	}
	
	
}
