package com.helpdesk.helpsdesk.controllers;


import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.services.dto.datosUsuarioRequest;
import com.helpdesk.helpsdesk.services.IUsuarioService;
import lombok.RequiredArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
   @GetMapping("/deshablitarUs/{numSec}")
   //@RequestMapping(value = "/deshablitarUs/{numSec}", method = RequestMethod.GET)
    public ResponseEntity<?> DeshabilitaUsuario(@PathVariable Long numSec){
        Boolean deshabilitado = iUsuarioService.deshabilitarUsuario(numSec);
        if (deshabilitado){
            System.out.println("lo logramos");
          return ResponseEntity.ok(deshabilitado);

        } else{
          return  ResponseEntity.ok(deshabilitado);
        }
   }
   @Transactional
   @GetMapping ("/crearUsuario")
    public  ResponseEntity<?> crearUsuario(@RequestBody datosUsuarioRequest datosUsuario ){
        Usuario usuario= new Usuario();
        usuario.setNombres(datosUsuario.getNombres());
        usuario.setApPaterno(datosUsuario.getApPaterno());
        usuario.setApMaterno(datosUsuario.getApMaterno());
        usuario.setDocIdentidad(datosUsuario.getDocIdentidad());
        usuario.setTipoUsuario(datosUsuario.getTipoUsuario());
        usuario.setEstado(datosUsuario.getEstado());
        usuario.setFechaNac(datosUsuario.getFechaNac());
        usuario.setFechaRegistro(datosUsuario.getFechaRegistro());

        Boolean creado = iUsuarioService.crearUsuario(usuario);
        if(creado){
            return  ResponseEntity.ok(HttpStatus.CREATED);
        }else{
           return  ResponseEntity.ok().body(creado);
        }
   }
}

