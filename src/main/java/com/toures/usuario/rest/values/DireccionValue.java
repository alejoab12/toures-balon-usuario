package com.toures.usuario.rest.values;

import java.sql.Timestamp;

import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.rest.modelos.DireccionModelo;

import lombok.Data;

@Data
public class DireccionValue {

	private Direccion direccion;
	private Nombre nombre;
	private Id usuarioId;

	public DireccionValue() {
	}

	public DireccionValue(DireccionModelo direccionModelo) {
		this.direccion = new Direccion(direccionModelo.getDireccion());
		this.nombre = new Nombre(direccionModelo.getNombre());
		this.usuarioId = new Id(direccionModelo.getUsuarioId());
	}

	public com.toures.usuario.persistencia.entidad.Direccion toEntity() {
		com.toures.usuario.persistencia.entidad.Direccion direccion = new com.toures.usuario.persistencia.entidad.Direccion();
		direccion.setDireccion(this.direccion.getValue());
		direccion.setNombre(this.nombre.getValue());
		direccion.setUsuarioId(new Usuario(this.getUsuarioId().getValue()));
		direccion.setActivo((short) 1);
		direccion.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
		return direccion;
	}
}
