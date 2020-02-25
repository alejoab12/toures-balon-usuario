package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_documento")
@Data
public class TipoDocumento {
    @Id
    private Integer id;
    private String name;
    public TipoDocumento(){}
    public TipoDocumento(Integer id){
        this.id=id;
    }
}
