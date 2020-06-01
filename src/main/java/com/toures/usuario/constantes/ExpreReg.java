package com.toures.usuario.constantes;

public interface ExpreReg {
	public static final String REGEX_PASSWORD = "^(?:(?=.*?[A-Z])(?:(?=.*?[0-9])(?=.*?[-!@#$%^&*()_"
			+ "[\\\\]{},.<>+=])|(?=.*?[a-z])(?:(?=.*?[0-9])|(?=.*?[-!@#$%^&*()_[\\\\]{},"
			+ ".<>+=])))|(?=.*?[a-z])(?=.*?[0-9])(?=.*?[-!@#$%^&*()_[\\\\]{},.<>+=]))[A-Za-z0-9!"
			+ "@#$%^&*()_[\\\\]{},.<>+=-]{7,50}$";
	public static final String REGEX_SOLO_LETRAS = "^[a-zA-Z\\s]*$";
	public static final String REGEX_DOCUMENTO = "^[[0-9]{8,16}]*$";
	public static final String REGEX_SOLO_NUMEROS = "^[0-9]*$";
	public static final String REGEX_LETRAS_NUMEROS = "^[0-9a-zA-Z]+$";
	public static final String REGEX_NOMBRE_USUARIO = "^[0-9a-zA-Z]{6,20}$";
	public static final String REGEX_TELEFONO = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
}
