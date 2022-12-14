package com.example.christianaraujofinal.service;

import com.example.christianaraujofinal.dto.TuristaDTO;

import java.util.List;

public interface TuristaService {

    List<TuristaDTO>listar();
    TuristaDTO obtenerId(Integer id);
    void guardar(TuristaDTO turista);
    void eliminar(Integer id);
    void actualizar(TuristaDTO turista);
}
