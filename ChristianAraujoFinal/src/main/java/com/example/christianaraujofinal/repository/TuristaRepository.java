package com.example.christianaraujofinal.repository;

import com.example.christianaraujofinal.model.Turista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {
}
