package com.helpdesk.helpsdesk.modelos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_funcionarios")
public class Funcionario {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "num_sec")
      private Long numSec;

      @Column (name ="nombre")
      private String nombre;

      @Column (name ="apellidos")
      private String apellido;

      @Column (name ="cedula_identidad")
      private String cedulaIdentidad;

      @Column (name ="cargo")
      private String cargo;

      @Column (name ="ubicacion")
      private String ubicacion;

      @Column (name ="unidad_organizacional")
      private String unidadOrganizacional;

      @Column (name ="estado")
      private String estado;

    public Long getNumSec() {
        return numSec;
    }

    public void setNumSec(Long numSec) {
        this.numSec = numSec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUnidadOrganizacional() {
        return unidadOrganizacional;
    }

    public void setUnidadOrganizacional(String unidadOrganizacional) {
        this.unidadOrganizacional = unidadOrganizacional;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
