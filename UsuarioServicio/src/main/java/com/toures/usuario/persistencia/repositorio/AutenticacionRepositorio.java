package com.toures.usuario.persistencia.repositorio;

import com.toures.usuario.persistencia.entidad.Autenticacion;
import com.toures.usuario.persistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutenticacionRepositorio extends JpaRepository<Autenticacion,Integer> {

    public Autenticacion findByUsuarioIdAndActivo(Usuario usuario,Short activo);

    @Query(value = "update autenticacion a set a.activo=0,fecha_inactivacion=current_timestamp() where a.usuario_id:=usuarioId ",nativeQuery = true)
    public void actualizarAutenticacion(@Param("usuarioId") Integer usuarioId);

    @Query(value="select a from Autenticacion a where a.usuarioId=:usuarioId and a.contrasena=:contrasena and a.activo=1")
    public Autenticacion buscarPorUsuarioYContrasena(@Param("usuarioId") Usuario usuarioId,@Param("contrasena") String contrasena);
}
