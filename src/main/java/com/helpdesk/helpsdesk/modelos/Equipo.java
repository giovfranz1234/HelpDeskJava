package com.helpdesk.helpsdesk.modelos;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "equipos")
public class Equipo implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "num_sec")
    private Long numSec;
    @Column (name = "cod_tipo_equipo")
    private String codTipoEquipo;
    @Column (name = "procesador")
    private String procesador;
    @Column (name = "memoria_ram")
    private String memoriaRam;
    @Column (name = "cap_almacenamiento")
    private String capAlmacenamiento;
    @Column (name = "lector_quemador" )
    private Date lectorQuemador;
    @Column (name = "lector_disquete")
    private String lectorDisquete;
    @Column (name = "tarjeta_video")
    private Date tarjetaVideo;
    @Column (name = "tipo_impresion")
    private String tipoImpresion;
    @Column (name = "tamaño_pulgadas")
    private String tamañoPulgadas;
    @Column (name = "tarjeta_madre")
    private String tarjetaMadre;
    @Column (name = "activo_fijo")
    private String ativoFijo;
    @Column (name = "sistema_operativo" )
    private Date sistemaOperativo;
    @Column (name = "tarjeta_red")
    private String tarjetaRed;
    @Column (name = "fechaRegistro")
    private Date fechaRegistro;
    @Column (name = "marca")
    private String marca;
    @Column (name = "observaciones")
    private Date observaciones  ;
    @Column (name = "estado")
    private String estado;
}
