package com.utad.examen_adat.repository;

import com.utad.examen_adat.model.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlquilerRepo extends JpaRepository<Alquiler, Integer> {

    List<Alquiler> findByContainingIgnoreCase(String titulo);
    List<Alquiler> findByUsuarioId(Long id);
    List<Alquiler> findByCocheId(Long id);


}
