package com.toures.usuario.persistencia.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "tipo_usuario")
@Entity
@Data
public class TipoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String nombre;
	@OneToMany(mappedBy = "tipoUsuarioId", targetEntity = TipoUsuarioRol.class)
	private List<TipoUsuarioRol> tipoUsuarioRoles;

	public TipoUsuario() {
	}

	public TipoUsuario(Integer id) {
		this.id = id;
	}
}
