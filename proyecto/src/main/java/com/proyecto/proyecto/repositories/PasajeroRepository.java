package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.PasajeroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasajeroRepository extends JpaRepository<PasajeroModel, Integer> {
}
