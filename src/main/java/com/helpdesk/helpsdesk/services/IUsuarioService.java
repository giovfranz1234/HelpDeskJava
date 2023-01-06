package com.helpdesk.helpsdesk.services;

import com.helpdesk.helpsdesk.modelos.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> obtenerUsuarios();

    Usuario obtUsByNumSec(Long numSec);
    Usuario guardar_usuario(Usuario usuario);
    Usuario actualizar_usuario(Long numSec, Usuario usActualizado);

    void borrar_usuario(Long numSec);

}
