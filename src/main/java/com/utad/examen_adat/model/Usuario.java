package com.utad.examen_adat.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_gen")
    @SequenceGenerator(name = "usuario_id_gen", sequenceName = "usuario_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String username;
    private String email;
    private String licenseNumber;
    @Column
    private String irbj_name;
    private String irbj_surname;

}
