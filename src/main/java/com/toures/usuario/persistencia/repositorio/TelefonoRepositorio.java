package com.toures.usuario.persistencia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toures.usuario.persistencia.entidad.Telefono;

@Repository
public interface TelefonoRepositorio extends JpaRepository<Telefono, Integer> {

	public List<Telefono> findByUsuarioId(String usuarioId);
}
