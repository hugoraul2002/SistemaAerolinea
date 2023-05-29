package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.VueloModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<VueloModel, Integer> {
}
