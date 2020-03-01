package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class Id {
	@NotNull
	private Integer value;

	public Id() {
	}

	public Id(Integer value) {
		this.value = value;
	}
}
