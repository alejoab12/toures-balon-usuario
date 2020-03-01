package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;

@Getter
public class Documento {
	@NotNull
	@Pattern(regexp = "^[0-9]{8,15}$")
	private Long value;

	public Documento() {
	}

	public Documento(Long value) {
		this.value = value;
	}
}
