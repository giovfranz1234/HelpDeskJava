package com.helpdesk.helpsdesk.repositories;

import com.helpdesk.helpsdesk.modelos.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {

        Equipo findByNumSec(Long numSec);
        void deleteByNumSec(Long numSec);


    }


