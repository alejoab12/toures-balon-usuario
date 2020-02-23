package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficioRepositorio extends JpaRepository<Beneficio,Integer> {
}
