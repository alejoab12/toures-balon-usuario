package com.toures.usuario.persistencia.entidad;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "telefono")
@Data
public class Telefono {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String telefono;
	private Short activo;
	private String nombre;
	@Column(name = "fecha_creacion")
	private Timestamp fechaCreacion;
	@Column(name = "fecha_inactivacion")
	private Timestamp fechaInactivacion;
	@JoinColumn(name = "usuario_id")
	@ManyToOne(targetEntity = Usuario.class)
	private Usuario usuarioId;
}
