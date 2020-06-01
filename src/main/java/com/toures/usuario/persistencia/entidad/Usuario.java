package com.toures.usuario.persistencia.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	private String id;
	@ManyToOne(targetEntity = TipoDocumento.class)
	@JoinColumn(name = "tipo_documento_id")
	private TipoDocumento tipoDocumentoId;
	private String documento;
	@Column(name = "correo",unique = true)
	private String correo;
	@Column(name = "nombre_usuario",unique = true)
	private String nombreUsuario;
	private String nombre;
	private String apellido;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@ManyToOne(targetEntity = TipoUsuario.class)
	@JoinColumn(name = "tipo_usuario_id")
	private TipoUsuario tipoUsuario;

	public Usuario(String id) {
		this.id = id;
	}

	public Usuario() {
	}
}
