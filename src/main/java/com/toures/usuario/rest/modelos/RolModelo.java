package com.toures.usuario.rest.modelos;

import javax.validation.constraints.Pattern;

import com.toures.usuario.constantes.ExpreReg;
import com.toures.usuario.constantes.ExpreRegMensage;
import com.toures.usuario.persistencia.entidad.Rol;

import lombok.Data;

@Data
public class RolModelo {
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
	private Integer id;
	private String nombre;

	public RolModelo(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public RolModelo() {
		super();
	}

	public RolModelo(Rol rol) {
		this.id = rol.getId();
		this.nombre = rol.getNombre();
	}

}
