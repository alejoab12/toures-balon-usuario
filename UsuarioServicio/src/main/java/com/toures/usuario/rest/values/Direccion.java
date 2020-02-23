package com.toures.usuario.rest.values;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Direccion {
    @NotNull
    private String value;

    public Direccion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
