package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.toures.usuario.persistencia.entidad.Direccion;
import com.toures.usuario.persistencia.entidad.Usuario;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class DireccionModelo {
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private String direccion;
	private String nombre;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Short activo;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaCreacion;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaInactivacion;
	private Integer usuarioId;

	public DireccionModelo() {
	}

	public DireccionModelo(Direccion direccion) {
		this.id = direccion.getId();
		this.direccion = direccion.getDireccion();
		this.activo = direccion.getActivo();
		this.fechaCreacion = direccion.getFechaCreacion();
		this.fechaInactivacion = direccion.getFechaInactivacion();
		this.nombre = direccion.getNombre();
		this.usuarioId = direccion.getUsuarioId().getId();
	}

	public Direccion toEntity() {
		Direccion direccion = new Direccion();
		direccion.setDireccion(this.direccion.toUpperCase());
		direccion.setNombre(this.nombre.toUpperCase());
		direccion.setUsuarioId(new Usuario(usuarioId));
		return direccion;

	}

}
