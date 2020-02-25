package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clasificacion")
@Data
public class Clasificacion {
    @Id
    private Integer id;
    private String nombre;
    @Column(name="puntos_minimos")
    private String puntosMinimos;

}
