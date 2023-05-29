package com.proyecto.proyecto.repositories;

import com.proyecto.proyecto.models.ReservacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository extends JpaRepository<ReservacionModel, Integer> {
}
