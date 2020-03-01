package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;

@Getter
public class Correo {
	@NotNull
	@Pattern(regexp = "^(.+)@(.+)$")
	private String value;

	public Correo() {
	}

	public Correo(String value) {
		this.value = value;
	}
}
