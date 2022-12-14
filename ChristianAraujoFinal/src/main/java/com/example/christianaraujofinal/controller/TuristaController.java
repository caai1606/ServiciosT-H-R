package com.example.christianaraujofinal.controller;

import com.example.christianaraujofinal.dto.TuristaDTO;
import com.example.christianaraujofinal.service.TuristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/turista/v1")
public class TuristaController {

    @Autowired
    private TuristaService service;

    @GetMapping("/listar")
    public @ResponseBody List<TuristaDTO> listar(){
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody TuristaDTO obtenerId(@PathVariable Integer id){
        return  service.obtenerId(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody TuristaDTO dto){
        service.guardar(dto);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizar (@RequestBody TuristaDTO dto){
        service.actualizar(dto);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }

}
