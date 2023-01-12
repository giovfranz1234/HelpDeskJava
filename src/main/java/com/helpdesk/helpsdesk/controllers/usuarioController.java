package com.helpdesk.helpsdesk.controllers;


import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.services.IUsuarioService;
import lombok.RequiredArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/helpDesk" )
@CrossOrigin
public class usuarioController {

    @Autowired
    private  IUsuarioService iUsuarioService;
    @Transactional(readOnly = true)
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> obtUsuarios(){
        return  ResponseEntity.ok().body( iUsuarioService.obtenerUsuarios());
    }

    @Transactional(readOnly = true)
    @GetMapping("/usuario/{numSec}")
    public ResponseEntity<Usuario> obtUsuarioNumSec(@PathVariable Long numSec){
      return ResponseEntity.ok().body(iUsuarioService.obtUsByNumSec(numSec));
    }

    @Transactional
    @PostMapping("/eliminarUs/{numSec}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long numSec){

            iUsuarioService.borrar_usuario(numSec);
        return ResponseEntity.noContent().build();
    }
   @Transactional
   @PostMapping("/modificarUsuario/{numSec}")
   public void ModificarUsuario (@PathVariable Long numSec){
   }

   @Transactional
   @GetMapping("/deshablitarUs/{numSec}")
    public ResponseEntity<?> DeshabilitaUsuario(@PathVariable Long numSec){
        Boolean deshabilitado = iUsuarioService.deshabilitarUsuario(numSec);
        if (deshabilitado){
          return ResponseEntity.noContent().build();
        } else{
          return ResponseEntity.notFound().build();
        }
   }
}

