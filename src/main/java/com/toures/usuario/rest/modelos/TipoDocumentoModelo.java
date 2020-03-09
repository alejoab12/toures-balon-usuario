package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TipoDocumentoModelo {

	private Integer id;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private String nombre;

	public TipoDocumentoModelo() {
	}

	public TipoDocumentoModelo(Integer id) {
		this.id = id;
	}

	public TipoDocumentoModelo(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
}
