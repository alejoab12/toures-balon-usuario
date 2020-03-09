package com.toures.usuario.rest.modelos;

import com.toures.usuario.persistencia.entidad.Rol;

import lombok.Data;

@Data
public class RolModelo {
	private Integer id;
	private String nombre;
	public RolModelo(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public RolModelo() {
		super();
	}
	public RolModelo(Rol rol) {
		this.id=rol.getId();
		this.nombre=rol.getNombre();
	}
	
}
