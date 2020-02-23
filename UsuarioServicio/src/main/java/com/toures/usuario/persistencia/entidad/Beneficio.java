package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="beneficio")
@Data
public class Beneficio {
    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    private String condicion;
    @Column(name="fecha_inicial_vigencia")
    private Timestamp fechaInicialVigencia;
    @Column(name="fecha_final_vigencia")
    private Timestamp fechaFinalVigencia;
}
