package com.example.christianaraujofinal.service;


import com.example.christianaraujofinal.dto.HospedajeDTO;

import java.util.List;

public interface HospedajeService {

    List<HospedajeDTO>listar();
    HospedajeDTO obtenerId(Integer id);
    void guardar(HospedajeDTO hospedaje);
    void eliminar(Integer id);
    void actualizar(HospedajeDTO hospedaje);
}
