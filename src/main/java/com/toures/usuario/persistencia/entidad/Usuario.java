package com.toures.usuario.persistencia.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(targetEntity = TipoDocumento.class)
	@JoinColumn(name = "tipo_documento_id")
	private TipoDocumento tipoDocumentoId;
	private String documento;
	private String correo;
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	private String nombre;
	private String apellido;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@ManyToOne(targetEntity = TipoUsuario.class)
	@JoinColumn(name = "tipo_usuario_id")
	private TipoUsuario tipoUsuario;

	public Usuario(Integer id) {
		this.id = id;
	}

	public Usuario() {
	}
}
