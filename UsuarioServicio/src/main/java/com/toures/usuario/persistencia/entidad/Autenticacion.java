package com.toures.usuario.persistencia.entidad;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@Entity
@Table(name="autenticacion")
public class Autenticacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contrasena;
    @Column(name="fecha_creacion")
    private Timestamp fechaCreacion;
    private Short activo;
    @JoinColumn(name="usuario_id")
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario usuarioId;
}
