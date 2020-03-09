package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.toures.usuario.persistencia.entidad.Usuario;
import lombok.Data;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

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
	private List<RolModelo> roles;

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
		if(Objects.nonNull(usuario.getUsuarioRoles())&&!usuario.getUsuarioRoles().isEmpty()) {
			this.roles=new ArrayList<>(usuario.getUsuarioRoles().size());
			usuario.getUsuarioRoles().forEach(rol->{
				this.roles.add(new RolModelo(rol.getRolId()));
			});
		}
	}

}
