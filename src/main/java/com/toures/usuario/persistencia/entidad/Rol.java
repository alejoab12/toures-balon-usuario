package com.toures.usuario.persistencia.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="rol")
@Data
public class Rol {
	@Id
	private Integer id;
	private String nombre;

}
