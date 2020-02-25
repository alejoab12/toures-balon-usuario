package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonoRepositorio extends JpaRepository<Telefono,Integer> {
}
