package com.toures.usuario.rest.values;

import lombok.Getter;

@Getter
public class TipoDocumentoValue {
    private Id id;


    public TipoDocumentoValue() {
    }

    public TipoDocumentoValue(Id id) {
        this.id = id;
    }
}
