package com.toures.usuario.persistencia.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tipo_usuario_rol")
@Data
public class TipoUsuarioRol {
	@Id
	private Integer id;
	@ManyToOne(targetEntity = TipoUsuario.class)
	@JoinColumn(name = "tipo_usuario_id")
	private TipoUsuario tipoUsuarioId;
	@ManyToOne(targetEntity = Rol.class)
	@JoinColumn(name = "rol_id")
	private Rol rolId;

}
