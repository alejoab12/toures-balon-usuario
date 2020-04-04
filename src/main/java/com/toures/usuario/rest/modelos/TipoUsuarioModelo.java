package com.toures.usuario.rest.modelos;

import javax.validation.constraints.Pattern;

import com.toures.usuario.constantes.ExpreReg;
import com.toures.usuario.constantes.ExpreRegMensage;
import com.toures.usuario.persistencia.entidad.TipoUsuario;

import lombok.Data;

@Data
public class TipoUsuarioModelo {
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
	private Integer id;
	private String nombre;

	public TipoUsuarioModelo() {
	}

	public TipoUsuarioModelo(TipoUsuario tipoUsuario) {
		this.id = tipoUsuario.getId();
		this.nombre = tipoUsuario.getNombre();
	}
}
