package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.IdentificacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificacionRepository extends JpaRepository<IdentificacionModel, Integer> {

}
