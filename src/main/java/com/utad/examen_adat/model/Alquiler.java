package com.utad.examen_adat.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "alquiler")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "alquiler_id_gen")
    @SequenceGenerator(name = "alquiler_id_gen", sequenceName = "alquiler_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coche_id", nullable = false)
    private Coche coche;

    @Column(nullable = false)
    private LocalDate rentalDate;

    @Column
    private LocalDate returnDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column
    private Double ignacio_price;

    @Column
    private String ignacio_comments;

    public Long getUsuarioId() {
        return usuario.getId();
    }

    public Long getCocheId() {
        return coche.getId();
    }

    public enum Status {
        ACTIVE,
        COMPLETED
    }
}
