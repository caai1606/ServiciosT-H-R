package com.example.christianaraujofinal.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hospedajes")
public class Hospedaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospedaje;
    private String nombre;

}
