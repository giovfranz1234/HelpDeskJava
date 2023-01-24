package com.helpdesk.helpsdesk.services.impl;


import com.helpdesk.helpsdesk.modelos.Equipo;
import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.repositories.EquipoRepository;
import com.helpdesk.helpsdesk.services.IEquipoService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipoServiceImpl implements IEquipoService {

    private final EquipoRepository equipoRepository;

    @Override
    public List<Equipo> ObtenerEquipos(){
        return equipoRepository.findAll();
    }
    @Override
    public Equipo obtenerEquipoSec(Long numSec) {
        return equipoRepository.findByNumSec(numSec);
    }

    @Override
    public Equipo guardar_equipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public void borrar_equipo(Long numSec) {
        equipoRepository.deleteByNumSec(numSec);

    }
    @Override
    public Boolean deshabilitarEquipo(Long numSec){
        Equipo EquipoBase = equipoRepository.findByNumSec(numSec);
        if (EquipoBase!=null){
            EquipoBase.setEstado("AN");
            equipoRepository.save(EquipoBase);
            return true;
        }else{
            return false;
        }
    }


}
