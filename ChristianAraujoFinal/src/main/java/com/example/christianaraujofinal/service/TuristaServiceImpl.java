package com.example.christianaraujofinal.service;

import com.example.christianaraujofinal.dto.TuristaDTO;
import com.example.christianaraujofinal.model.Turista;
import com.example.christianaraujofinal.repository.TuristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TuristaServiceImpl implements TuristaService {

    @Autowired
    private TuristaRepository repository;

    @Override
    public List<TuristaDTO> listar() {

        List<TuristaDTO> listadto = new ArrayList<>();
        TuristaDTO dto = null;

        for (Turista turista : repository.findAll()) {
            dto = new TuristaDTO();
            dto.setIdTurista(turista.getIdTurista());
            dto.setNombreTurista(turista.getNombreTurista());
            dto.setNroCelular(turista.getNroCelular());
            dto.setDireccion(turista.getDireccion());
            listadto.add(dto);
        }


        return listadto;

    }

    @Override
    public TuristaDTO obtenerId(Integer id) {

        Turista turista = repository.findById(id).orElse(null);

        TuristaDTO dto = new TuristaDTO();
        dto.setIdTurista(turista.getIdTurista());
        dto.setNombreTurista(turista.getNombreTurista());
        dto.setNroCelular(turista.getNroCelular());
        dto.setDireccion(turista.getDireccion());

        return dto;
    }

    @Override
    public void guardar(TuristaDTO turista) {

        Turista tur = new Turista();
        tur.setIdTurista(turista.getIdTurista());
        tur.setNombreTurista(turista.getNombreTurista());
        tur.setNroCelular(turista.getNroCelular());
        tur.setDireccion(turista.getDireccion());

        repository.save(tur);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(TuristaDTO turista) {

        Turista turi = new Turista();
        turi.setIdTurista(turista.getIdTurista());
        turi.setNombreTurista(turista.getNombreTurista());
        turi.setNroCelular(turista.getNroCelular());
        turi.setDireccion(turista.getDireccion());

        repository.saveAndFlush(turi);
    }
}
