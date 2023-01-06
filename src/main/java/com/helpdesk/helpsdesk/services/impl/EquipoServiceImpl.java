package com.helpdesk.helpsdesk.services.impl;


import com.helpdesk.helpsdesk.modelos.Equipo;
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
      List<Equipo> res= equipoRepository.findAll();
      return  res;
    }
}
