package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.TipoDocumento;
import com.toures.usuario.persistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

	public Usuario findByDocumentoAndTipoDocumentoId(String documento, TipoDocumento tipoDocumentoId);

	public Usuario findByNombreUsuarioOrCorreo(String nombreUsuario, String correo);
}
