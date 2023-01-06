package com.helpdesk.helpsdesk.repositories;

import com.helpdesk.helpsdesk.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
   Usuario findByNumSec(Long numSec);
   void deleteByNumSec(Long numSec);


}
