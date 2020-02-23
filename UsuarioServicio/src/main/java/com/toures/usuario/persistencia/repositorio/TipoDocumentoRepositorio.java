package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepositorio  extends JpaRepository<TipoDocumento,Integer> {
}
