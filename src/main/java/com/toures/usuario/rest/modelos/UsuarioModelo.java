package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.toures.usuario.persistencia.entidad.Usuario;
import lombok.Data;

import java.util.Date;

@Data
public class UsuarioModelo {

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private TipoDocumentoModelo tipoDocumentoId;
	private Long documento;
	private String correo;
	private String nombreUsuario;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer puntosAcomulados;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String contrasena;

	public UsuarioModelo() {
	}

	public UsuarioModelo(Usuario usuario) {
		this.id = usuario.getId();
		this.tipoDocumentoId = new TipoDocumentoModelo(usuario.getTipoDocumentoId().getId(),
				usuario.getTipoDocumentoId().getName());
		this.documento = usuario.getDocumento();
		this.correo = usuario.getCorreo();
		this.nombreUsuario = usuario.getNombreUsuario();
		this.nombre = usuario.getNombre();
		this.apellido = usuario.getApellido();
		this.fechaNacimiento = usuario.getFechaNacimiento();
		this.puntosAcomulados = usuario.getPuntosAcomulados();
	}

}
