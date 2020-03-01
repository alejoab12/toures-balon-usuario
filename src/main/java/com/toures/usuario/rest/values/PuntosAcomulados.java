package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class PuntosAcomulados {
	@NotNull
	private Integer value;

	public PuntosAcomulados(Integer value) {
		this.value = value;
	}
}
