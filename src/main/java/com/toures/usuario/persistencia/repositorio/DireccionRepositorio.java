package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.Direccion;
import com.toures.usuario.persistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion,Integer> {

    public List<Direccion> findByUsuarioId(Usuario usuario);
}
