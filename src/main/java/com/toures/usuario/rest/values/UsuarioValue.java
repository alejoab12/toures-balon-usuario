package com.toures.usuario.rest.values;

import com.toures.usuario.persistencia.entidad.TipoDocumento;
import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.rest.modelos.UsuarioModelo;

import lombok.Getter;

@Getter
public class UsuarioValue {

	private Id id;
	private TipoDocumentoValue tipoDocumento;
	private Documento documento;
	private Correo correo;
	private NombreUsuario nombreUsuario;
	private Nombre nombre;
	private Apellido apellido;
	private FechaNacimiento fechaNacimiento;
	private PuntosAcomulados puntosAcomulados;
	private Contrasena contrasena;

	public UsuarioValue() {
	}

	public UsuarioValue(UsuarioModelo usuarioModelo) {
		this.id = new Id(usuarioModelo.getId());
		this.tipoDocumento = new TipoDocumentoValue(new Id(usuarioModelo.getTipoDocumentoId().getId()));
		this.documento = new Documento(usuarioModelo.getDocumento());
		this.correo = new Correo(usuarioModelo.getCorreo());
		this.nombreUsuario = new NombreUsuario(usuarioModelo.getNombreUsuario());
		this.nombre = new Nombre(usuarioModelo.getNombre());
		this.apellido = new Apellido(usuarioModelo.getApellido());
		this.fechaNacimiento = new FechaNacimiento(usuarioModelo.getFechaNacimiento());
		this.puntosAcomulados = new PuntosAcomulados(usuarioModelo.getPuntosAcomulados());
		this.contrasena = new Contrasena(usuarioModelo.getContrasena());
	}

	public Usuario toEntity() {
		Usuario usuario = new Usuario();
		usuario.setApellido(apellido.getValue().toUpperCase());
		usuario.setNombre(nombre.getValue().toUpperCase());
		usuario.setCorreo(correo.getValue().toUpperCase());
		usuario.setFechaNacimiento(fechaNacimiento.getValue());
		usuario.setNombreUsuario(nombreUsuario.getValue().toUpperCase());
		usuario.setDocumento(documento.getValue());
		usuario.setTipoDocumentoId(new TipoDocumento(tipoDocumento.getId().getValue()));
		usuario.setPuntosAcomulados(0);
		return usuario;
	}

}
