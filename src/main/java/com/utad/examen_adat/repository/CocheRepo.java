package com.utad.examen_adat.repository;
import com.utad.examen_adat.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepo extends JpaRepository<Coche, Long> {
}
