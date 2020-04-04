package com.toures.usuario.rest.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.toures.usuario.persistencia.entidad.Direccion;
import com.toures.usuario.persistencia.entidad.Usuario;
import lombok.Data;
import java.sql.Timestamp;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank;
import com.toures.usuario.constantes.ExpreReg;
import com.toures.usuario.constantes.ExpreRegMensage;

@Data
public class DireccionModelo {
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Integer id;
	@NotBlank
	private String direccion;
	@Pattern(regexp = ExpreReg.REGEX_LETRAS_NUMEROS, message = ExpreRegMensage.MENSAJE_LETRAS_NUMEROS)
	private String nombre;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Short activo;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaCreacion;
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private Timestamp fechaInactivacion;
	@Pattern(regexp = ExpreReg.REGEX_SOLO_NUMEROS, message = ExpreRegMensage.MENSAJE_SOLO_NUMEROS)
	private String usuarioId;

	public DireccionModelo() {
	}

	public DireccionModelo(Direccion direccion) {
		this.id = direccion.getId();
		this.direccion = direccion.getDireccion();
		this.activo = direccion.getActivo();
		this.fechaCreacion = direccion.getFechaCreacion();
		this.fechaInactivacion = direccion.getFechaInactivacion();
		this.nombre = direccion.getNombre();
		this.usuarioId = direccion.getUsuarioId().getId();
	}

	public Direccion toEntity() {
		Direccion direccion = new Direccion();
		direccion.setDireccion(this.direccion.toUpperCase());
		direccion.setNombre(this.nombre.toUpperCase());
		direccion.setUsuarioId(new Usuario(usuarioId));
		return direccion;

	}

}
