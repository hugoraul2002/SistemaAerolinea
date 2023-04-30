package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {

}
