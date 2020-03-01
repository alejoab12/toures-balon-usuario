package com.toures.usuario.rest.modelos;

import lombok.Data;

@Data
public class AutenticacionModelo {
	private String correo;
	private String nombreUsuario;
	private String contrasena;
}
