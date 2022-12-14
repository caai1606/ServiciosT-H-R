package com.example.christianaraujofinal.service;

import com.example.christianaraujofinal.dto.ReservaDTO;
import com.example.christianaraujofinal.model.Reserva;
import com.example.christianaraujofinal.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository repository;

    @Override
    public List<ReservaDTO> listar() {

        List<ReservaDTO> listadto = new ArrayList<>();
        ReservaDTO dto = null;

        for (Reserva reserva : repository.findAll()) {
            dto = new ReservaDTO();
            dto.setIdReserva(reserva.getIdReserva());
            dto.setCosto(reserva.getCosto());
            listadto.add(dto);
        }


        return listadto;

    }

    @Override
    public ReservaDTO obtenerId(Integer id) {

        Reserva reserva = repository.findById(id).orElse(null);

        ReservaDTO dto = new ReservaDTO();
        dto.setIdReserva(reserva.getIdReserva());
        dto.setCosto(reserva.getCosto());

        return dto;
    }

    @Override
    public void guardar(ReservaDTO reserva) {

        Reserva pro = new Reserva();
        pro.setIdReserva(reserva.getIdReserva());
        pro.setCosto(reserva.getCosto());

        repository.save(pro);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void actualizar(ReservaDTO reserva) {

        Reserva res = new Reserva();
        res.setIdReserva(reserva.getIdReserva());
        res.setCosto(reserva.getCosto());

        repository.saveAndFlush(res);
    }
}
