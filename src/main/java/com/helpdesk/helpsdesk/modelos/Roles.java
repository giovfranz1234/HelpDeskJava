package com.helpdesk.helpsdesk.modelos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "p_roles")
public class Roles {
    @Id
    @Column(name = "num_sec")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String numsec;
    @Column
     private String rol;
    @Column
     private String estado;

    public String getNumsec() {
        return numsec;
    }
    public void setNumsec(String numsec) {
        this.numsec = numsec;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
