package com.toures.usuario.persistencia.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="usuario_rol")
@Data
public class UsuarioRol {
	@Id
	private Integer id;
	@ManyToOne(targetEntity = Usuario.class)
	@JoinColumn(name="usuario_id")
	private Usuario usuarioId;
	@ManyToOne(targetEntity = Rol.class)
	@JoinColumn(name="rol_id")
	private Rol rolId;

}
