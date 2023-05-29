package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.AvionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<AvionModel, Integer> {

}
