package com.toures.usuario.rest.values;

import lombok.Getter;

import javax.validation.constraints.NotNull;

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
