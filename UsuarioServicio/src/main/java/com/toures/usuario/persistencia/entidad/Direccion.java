package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name="direccion")
@Data
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String direccion;
    private Short activo;
    @Column(name="fecha_creacion")
    private Timestamp fechaCreacion;
    @Column(name="fecha_inactivacion")
    private Timestamp fechaInactivacion;
    @JoinColumn(name="usuario_id")
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario usuarioId;
}
