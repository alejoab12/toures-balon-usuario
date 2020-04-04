package com.toures.usuario.rest.modelos;

import java.sql.Timestamp;

import javax.validation.constraints.Pattern;

import com.toures.usuario.constantes.ExpreReg;
import com.toures.usuario.constantes.ExpreRegMensage;
import com.toures.usuario.persistencia.entidad.Telefono;
import com.toures.usuario.persistencia.entidad.Usuario;

import lombok.Data;

@Data
public class TelefonoModelo {
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
	private Integer id;
	@Pattern(regexp = ExpreReg.REGEX_TELEFONO, message = ExpreRegMensage.MENSAJE_TELEFONO)
	private String telefono;
	private Short activo;
	@Pattern(regexp = ExpreReg.REGEX_LETRAS_NUMEROS, message = ExpreRegMensage.MENSAJE_LETRAS_NUMEROS)
	private String nombre;
	private Timestamp fechaCreacion;
	private Timestamp fechaInactivacion;
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
	private String usuarioId;

	public TelefonoModelo() {
	}

	public TelefonoModelo(Telefono telefono) {
		this.id = telefono.getId();
		this.telefono = telefono.getTelefono();
		this.activo = telefono.getActivo();
		this.nombre = telefono.getNombre();
		this.fechaCreacion = telefono.getFechaCreacion();
		this.fechaInactivacion = telefono.getFechaInactivacion();
		this.usuarioId = telefono.getUsuarioId().getId();
	}

	public Telefono toEntity() {
		Telefono telefono = new Telefono();
		telefono.setTelefono(this.telefono);
		telefono.setNombre(this.nombre.toUpperCase());
		telefono.setUsuarioId(new Usuario(this.usuarioId));
		return telefono;
	}
}
