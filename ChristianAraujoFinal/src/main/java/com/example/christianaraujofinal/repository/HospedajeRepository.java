package com.example.christianaraujofinal.repository;


import com.example.christianaraujofinal.model.Hospedaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer> {
}
