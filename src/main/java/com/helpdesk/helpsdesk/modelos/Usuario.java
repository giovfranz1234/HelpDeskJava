package com.helpdesk.helpsdesk.modelos;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "numSec")
    private Long numSec;
    @Column (name = "nombres", nullable = false)
    private String nombres;
    @Column (name = "ap_paterno",nullable = false)
    private String apPaterno;
    @Column (name = "ap_materno")
    private String apMaterno;   
    @Column (name = "doc_identidad",nullable = false)
    private String docIdentidad;
    @Column (name = "fecha_nac" )
    private Date fechaNac;
    @Column (name = "tipo_usuario",nullable = false)
    private String tipoUsuario;
    @Column (name = "fecha_registro")
    private Date fechaRegistro;
    @Column (name = "estado",nullable = false)
    private String estado;
}
