package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepositorio extends JpaRepository<Clasificacion,Integer> {
}
