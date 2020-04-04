package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.validation.constraints.Pattern;

import com.toures.usuario.constantes.ExpreReg;
import com.toures.usuario.constantes.ExpreRegMensage;
@Data
public class TipoDocumentoModelo {
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
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
