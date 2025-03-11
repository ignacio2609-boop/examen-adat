package com.utad.examen_adat.service;

import com.utad.examen_adat.model.Coche;
import com.utad.examen_adat.repository.CocheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocheService {
    @Autowired
    CocheRepo cocheRepo;

    public List<Coche> getAllCars() { return cocheRepo.findAll(); }
    public Optional<Coche> findById(Long id) { return cocheRepo.findById(id); }
    public Coche saveOrUpdateCar(Coche coche) { return cocheRepo.save(coche); }
    public void deleteCar(Long id) { cocheRepo.deleteById(id); }
}
