package com.toures.usuario.rest.values;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.Date;

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
