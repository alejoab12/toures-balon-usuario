package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;

@Getter
public class NombreUsuario {
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{6,25}$")
	private String value;

	public NombreUsuario() {
	}

	public NombreUsuario(String value) {
		this.value = value;
	}
}
