package com.toures.usuario.negocio.servicio;

import com.toures.usuario.persistencia.entidad.Direccion;
import com.toures.usuario.persistencia.entidad.Usuario;
import com.toures.usuario.persistencia.repositorio.DireccionRepositorio;
import com.toures.usuario.rest.modelos.DireccionModelo;
import com.toures.usuario.rest.values.DireccionValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DireccionServicio {
    @Autowired
    private DireccionRepositorio direccionRepositorio;

    public List<DireccionModelo> buscarDireccionesPorIdCliente(Integer idCliente) {
        List<Direccion> direccionesEntity=direccionRepositorio.findByUsuarioId(new Usuario(idCliente));
        List<DireccionModelo> direcciones = new ArrayList<>(direccionesEntity.size());
        direccionesEntity.forEach(direccion -> {
            direcciones.add(new DireccionModelo(direccion));
        });
        return direcciones;
    }

    public void crearDireccion(DireccionValue direccionValue){
        direccionRepositorio.saveAndFlush(direccionValue.toEntity());
    }
}
