package com.helpdesk.helpsdesk.controllers;

import com.helpdesk.helpsdesk.modelos.Equipo;
import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.services.IEquipoService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/helpDesk" )
@CrossOrigin
public class EquipoController {
    @Autowired
    private IEquipoService iEquipoService;

    @Transactional(readOnly = true)
    @GetMapping("/equipos")

        public List<Equipo> obtEquipos(){return iEquipoService.ObtenerEquipos();
        }
    @Transactional(readOnly = true)
    @GetMapping("/equipo/{numSec}")
    public ResponseEntity<Equipo> obtEquipoNumSec(@PathVariable Long numSec){
        return ResponseEntity.ok().body(iEquipoService.obtenerEquipoSec(numSec));
    }
    @Transactional
    @PostMapping("/eliminarEq/{numSec}")
    public ResponseEntity<?> eliminarEquipo(@PathVariable Long numSec){

        iEquipoService.borrar_usuario(numSec);
        return ResponseEntity.noContent().build();
    }
}
