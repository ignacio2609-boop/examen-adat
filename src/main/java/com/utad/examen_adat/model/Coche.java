package com.utad.examen_adat.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "coche")
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "coche_id_gen")
    @SequenceGenerator(name = "coche_id_gen", sequenceName = "coche_id_seq", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String plateNumber;
    private String brand;
    private String model;
    private Integer year;
    private Boolean available;
    private String bonilla_color;
}
