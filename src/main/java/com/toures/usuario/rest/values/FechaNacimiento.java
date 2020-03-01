package com.toures.usuario.rest.values;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class FechaNacimiento {
	@NotNull
	private Date value;

	public FechaNacimiento() {
	}

	public FechaNacimiento(Date value) {
		this.value = value;
	}
}
