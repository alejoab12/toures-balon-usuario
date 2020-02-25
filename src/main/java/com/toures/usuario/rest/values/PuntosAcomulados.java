package com.toures.usuario.rest.values;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class PuntosAcomulados {
    @NotNull
    private Integer value;

    public PuntosAcomulados(Integer value) {
        this.value = value;
    }
}
