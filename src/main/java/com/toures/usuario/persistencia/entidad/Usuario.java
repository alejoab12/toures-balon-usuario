package com.toures.usuario.persistencia.entidad;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(targetEntity = TipoDocumento.class)
    @JoinColumn(name = "tipo_documento_id")
    private TipoDocumento tipoDocumentoId;
    private Long documento;
    private String correo;
    @Column(name="nombre_usuario")
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name = "puntos_acomulados")
    private Integer puntosAcomulados;
    public Usuario(Integer id){
        this.id=id;
    }
    public Usuario(){}
}
