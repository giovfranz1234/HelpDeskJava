package com.helpdesk.helpsdesk.modelos;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "t_cpus")
@Data
public class Cpu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_sec")
    private Long numSec;

    @Column(name = "nsec_funcionario")
    private String nsecFuncionario;

    @Column(name = "activo_fijo")
    private String activoFijo;

    @Column(name ="capacidad_disco")
    private String capacidadDisco;
    @Column(name ="lector_disquete")
    private String lectorDisquete;
    @Column(name="lector_dvd")
    private String lectorDvd;
    @Column (name="memmoria_ram")
    private String memoriaRam;
    @Column (name = "sistema_operativo")
    private String sistemaOperativo;
    @Column (name = "tarjeta_madre")
    private String tarjetaMadre;
    @Column (name="tarjeta_red")
    private String tarjetaRed;

}
