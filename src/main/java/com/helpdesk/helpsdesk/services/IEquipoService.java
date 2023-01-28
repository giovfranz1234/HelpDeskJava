package com.helpdesk.helpsdesk.services;

import com.helpdesk.helpsdesk.modelos.Equipo;
import com.helpdesk.helpsdesk.modelos.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEquipoService {
    List<Equipo> ObtenerEquipos();
    Equipo obtenerEquipoSec(Long numSec);
    Equipo guardar_equipo(Equipo equipo);
    void borrar_equipo(Long numSec);
    Boolean deshabilitarEquipo(Long numSec);

    void borrar_usuario(Long numSec);


    }
