package com.toures.usuario.rest.modelos;

import java.sql.Timestamp;

import com.toures.usuario.persistencia.entidad.Telefono;
import com.toures.usuario.persistencia.entidad.Usuario;

import lombok.Data;

@Data
public class TelefonoModelo {

	private Integer id;
	private String telefono;
	private Short activo;
	private String nombre;
	private Timestamp fechaCreacion;
	private Timestamp fechaInactivacion;
	private Integer usuarioId;

	public TelefonoModelo() {
	}

	public TelefonoModelo(Telefono telefono) {
		this.id = telefono.getId();
		this.telefono = telefono.getTelefono();
		this.activo = telefono.getActivo();
		this.nombre = telefono.getNombre();
		this.fechaCreacion = telefono.getFechaCreacion();
		this.fechaInactivacion = telefono.getFechaInactivacion();
		this.usuarioId = telefono.getUsuarioId().getId();
	}

	public Telefono toEntity() {
		Telefono telefono = new Telefono();
		telefono.setTelefono(this.telefono);
		telefono.setNombre(this.nombre.toUpperCase());
		telefono.setUsuarioId(new Usuario(this.usuarioId));
		return telefono;
	}
}
