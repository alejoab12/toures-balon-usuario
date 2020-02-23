package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.ClasificacionBeneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionBeneficioRepositorio extends JpaRepository<ClasificacionBeneficio,Integer> {
}
