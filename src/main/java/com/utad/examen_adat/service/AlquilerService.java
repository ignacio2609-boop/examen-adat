package com.utad.examen_adat.service;

import com.utad.examen_adat.model.Alquiler;
import com.utad.examen_adat.model.Usuario;
import com.utad.examen_adat.repository.AlquilerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlquilerService {
    @Autowired
    AlquilerRepo alquilerRepo;

    public List<Alquiler> getAllRentals() { return alquilerRepo.findAll();}
    public List<Usuario> getRentalsByUser(Long id) { return alquilerRepo.findByUsuarioId(id);}

}
