package com.helpdesk.helpsdesk.controllers;

import com.helpdesk.helpsdesk.modelos.Equipo;
import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.services.IEquipoService;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/helpDesk" )
@CrossOrigin
public class EquipoController {

    private final IEquipoService iEquipoService;

    @Transactional(readOnly = true)
    @GetMapping("/equipos")

        public List<Equipo> obtEquipos(){return iEquipoService.ObtenerEquipos();
        }

}
