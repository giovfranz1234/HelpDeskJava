package com.helpdesk.helpsdesk.services;

import com.helpdesk.helpsdesk.modelos.Equipo;
import com.helpdesk.helpsdesk.modelos.Usuario;

import java.util.List;

public interface IEquipoService {
    List<Equipo> ObtenerEquipos();
    Equipo obtenerEquipoSec(Long numSec);
    Equipo guardar_equipo(Equipo equipo);
    void borrar_equipo(Long numSec);
    Boolean deshabilitarEquipo(Long numSec);

}
