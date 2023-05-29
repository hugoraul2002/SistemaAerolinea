package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel, Integer> {

}

