package com.example.christianaraujofinal.service;

import com.example.christianaraujofinal.dto.HospedajeDTO;
import com.example.christianaraujofinal.model.Hospedaje;
import com.example.christianaraujofinal.repository.HospedajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospedajeServiceImpl implements HospedajeService {

    @Autowired
    private HospedajeRepository repository;

    @Override
    public List<HospedajeDTO> listar() {

        List<HospedajeDTO> listadto = new ArrayList<>();
        HospedajeDTO dto = null;

        for (Hospedaje hospedaje : repository.findAll()) {
            dto = new HospedajeDTO();
            dto.setIdHospedaje(hospedaje.getIdHospedaje());
            dto.setNombre(hospedaje.getNombre());
            listadto.add(dto);
        }


        return listadto;

    }

    @Override
    public HospedajeDTO obtenerId(Integer id) {

        Hospedaje hospedaje = repository.findById(id).orElse(null);

        HospedajeDTO dto = new HospedajeDTO();
        dto.setIdHospedaje(hospedaje.getIdHospedaje());
        dto.setNombre(hospedaje.getNombre());

        return dto;
    }

    @Override
    public void guardar(HospedajeDTO hospedaje) {

        Hospedaje hos = new Hospedaje();
        hos.setIdHospedaje(hospedaje.getIdHospedaje());
        hos.setNombre(hospedaje.getNombre());

        repository.save(hos);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(HospedajeDTO hospedaje) {

        Hospedaje hos = new Hospedaje();
        hos.setIdHospedaje(hospedaje.getIdHospedaje());
        hos.setNombre(hospedaje.getNombre());

        repository.saveAndFlush(hos);
    }
}
