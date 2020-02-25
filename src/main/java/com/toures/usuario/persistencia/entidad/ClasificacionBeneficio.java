package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="clasificacion_beneficio")
@Data
public class ClasificacionBeneficio {
    @Id
    private Integer id;
    @JoinColumn(name="clasificacion_id")
    @ManyToOne( targetEntity = Clasificacion.class )
    private Clasificacion clasificacionId;
    @JoinColumn(name="beneficio_id")
    @ManyToOne(targetEntity = Beneficio.class)
    private Beneficio beneficioId;
}
