package com.utad.examen_adat.service;

import com.utad.examen_adat.model.Alquiler;
import com.utad.examen_adat.repository.AlquilerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlquilerService {
    @Autowired
    AlquilerRepo alquilerRepo;

    public List<Alquiler> getAllRentals() { return alquilerRepo.findAll();}
    public Optional<Alquiler> findById(Long id) { return alquilerRepo.findById(Math.toIntExact(id));}
    public List<Alquiler> getRentalsByUser(Long id) { return alquilerRepo.findByUsuarioId(id);}
    public List<Alquiler> getRentalsByCar(Long id) { return alquilerRepo.findByCocheId(id);}
    public Alquiler saveOrUpdateRental(Alquiler alquiler) { return alquilerRepo.save(alquiler);}
    public void deleteRental(Integer id) { alquilerRepo.deleteById(id);}


}
