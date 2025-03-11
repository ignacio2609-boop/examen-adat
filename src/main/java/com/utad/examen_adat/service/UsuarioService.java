package com.utad.examen_adat.service;

import com.utad.examen_adat.model.Usuario;
import com.utad.examen_adat.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepo usuarioRepo;

    public List<Usuario> getAllUsers() { return usuarioRepo.findAll(); }
    public Optional<Usuario> findById(Long id) { return usuarioRepo.findById(id); }
    public Usuario saveOrUpdateUser(Usuario usuario) { return usuarioRepo.save(usuario); }
    public void deleteUser(Long id) { usuarioRepo.deleteById(id); }
}
