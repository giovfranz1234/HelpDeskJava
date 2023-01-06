package com.helpdesk.helpsdesk.controllers;


import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.services.IUsuarioService;
import lombok.RequiredArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Usuario> obtUsuarios(){
        return iUsuarioService.obtenerUsuarios();
    }

    @Transactional(readOnly = true)
    @GetMapping("/usuario/{numSec}")
    public Usuario obtUsuarioNumSec(@PathVariable Long numSec){
      return iUsuarioService.obtUsByNumSec(numSec);
    }

    @Transactional
    @PostMapping("/eliminarUs/{numSec}")
    public Usuario eliminarUsuario(@PathVariable Long numSec){

            Usuario usuarioaBorrar= new Usuario();
            usuarioaBorrar.setEstado("AN");
            iUsuarioService.borrar_usuario(numSec);
            return usuarioaBorrar;


    }

}

