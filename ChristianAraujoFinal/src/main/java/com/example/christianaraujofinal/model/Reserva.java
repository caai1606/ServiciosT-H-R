package com.example.christianaraujofinal.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    private String costo;
}
