package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.persistencia.entidad.TipoDocumento;
import com.toures.usuario.persistencia.entidad.TipoUsuario;
import lombok.Data;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

import java.util.Date;

@Data
public class UsuarioModelo {

	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	private TipoDocumentoModelo tipoDocumento;
	private String documento;
	private String correo;
	private String nombreUsuario;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String contrasena;
	private List<RolModelo> roles;
	private TipoUsuarioModelo tipoUsuario;

	public UsuarioModelo() {
	}

	public UsuarioModelo(Usuario usuario) {
		this.id = usuario.getId();
		this.tipoDocumento = new TipoDocumentoModelo(usuario.getTipoDocumentoId().getId(),
				usuario.getTipoDocumentoId().getName());
		this.documento = usuario.getDocumento();
		this.correo = usuario.getCorreo();
		this.nombreUsuario = usuario.getNombreUsuario();
		this.nombre = usuario.getNombre();
		this.apellido = usuario.getApellido();
		this.fechaNacimiento = usuario.getFechaNacimiento();
		this.tipoUsuario = new TipoUsuarioModelo(usuario.getTipoUsuario());
		if (Objects.nonNull(usuario.getTipoUsuario().getTipoUsuarioRoles())
				&& !usuario.getTipoUsuario().getTipoUsuarioRoles().isEmpty()) {
			this.roles = new ArrayList<>(usuario.getTipoUsuario().getTipoUsuarioRoles().size());
			usuario.getTipoUsuario().getTipoUsuarioRoles().forEach(rol -> {
				this.roles.add(new RolModelo(rol.getRolId()));
			});
		}
	}

	public Usuario toEntity() {
		Usuario usuario = new Usuario();
		usuario.setDocumento(this.documento);
		usuario.setCorreo(this.correo.toUpperCase());
		usuario.setFechaNacimiento(this.fechaNacimiento);
		usuario.setNombreUsuario(this.nombreUsuario.toUpperCase());
		usuario.setApellido(this.apellido.toUpperCase());
		usuario.setNombre(this.nombre.toUpperCase());
		usuario.setTipoDocumentoId(new TipoDocumento(this.getTipoDocumento().getId()));
		usuario.setTipoUsuario(new TipoUsuario(this.getTipoUsuario().getId()));
		return usuario;

	}

}
