package com.toures.usuario.componente;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.stereotype.Component;

@Component
public class MD5 {

	public String cifrar(String contrasena) {
		return getSecurePassword(contrasena);
	}

	private String getSecurePassword(String passwordToHash) {
		String generatedPassword = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
			generatedPassword = new String(Base64.getEncoder().encode(bytes));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}

}