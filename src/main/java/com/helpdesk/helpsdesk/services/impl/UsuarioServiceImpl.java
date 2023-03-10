package com.helpdesk.helpsdesk.services.impl;

import com.helpdesk.helpsdesk.modelos.Usuario;
import com.helpdesk.helpsdesk.repositories.UsuarioRepository;
import com.helpdesk.helpsdesk.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements IUsuarioService {
   @Autowired
    private  UsuarioRepository usuarioRepository;

    @Override
      public List<Usuario> obtenerUsuarios() {
        List <Usuario> res = usuarioRepository.findAll();
        return res;
    }

    @Override

    public Usuario obtUsByNumSec(Long numSec) {
        return usuarioRepository.findByNumSec(numSec);
    }

    @Override

    public Usuario guardar_usuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override

    public Usuario actualizar_usuario(Long numSec, Usuario usActualizado) {

        Usuario usuarioBase = usuarioRepository.findByNumSec(numSec);

        usuarioBase.setNombres(usActualizado.getNombres());
        usuarioBase.setApPaterno(usActualizado.getApPaterno());
        usuarioBase.setApMaterno(usActualizado.getApMaterno());
        usuarioBase.setDocIdentidad(usActualizado.getDocIdentidad());
        usuarioBase.setFechaNac(usActualizado.getFechaNac());
        usuarioBase.setTipoUsuario(usActualizado.getTipoUsuario());
        usuarioBase.setFechaRegistro(usActualizado .getFechaRegistro());
        usuarioBase.setEstado(usActualizado.getEstado());

        return usuarioRepository.save(usuarioBase);
    }

    @Override

    public void borrar_usuario(Long numSec) {
        usuarioRepository.deleteByNumSec(numSec);

    }
}
