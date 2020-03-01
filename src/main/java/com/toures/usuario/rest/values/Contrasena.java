package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;

@Getter
public class Contrasena {
	@NotNull
	@Pattern(regexp = "^[a-zA]{8,30}$")
	private String value;

	public Contrasena(String value) {
		this.value = value;
	}

	public Contrasena() {
	}

}
