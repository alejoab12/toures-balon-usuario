package com.toures.usuario.rest.values;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
public class Nombre {
    @NotNull
    @Pattern(regexp = "^[a-zA]{3,30}$")
    private String value;

    public Nombre(String value) {
        this.value = value;
    }

    public Nombre() {
    }

}
