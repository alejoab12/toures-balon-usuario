package com.toures.usuario;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
//inicio
@Aspect
@SpringBootApplication
public class UsuarioServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioServicioApplication.class, args);
	}

}
