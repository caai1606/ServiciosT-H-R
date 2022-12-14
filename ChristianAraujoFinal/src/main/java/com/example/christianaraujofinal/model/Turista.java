package com.example.christianaraujofinal.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "turistas")
public class Turista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurista;
    private String nombreTurista;
    private String nroCelular;

    private String direccion;
}
