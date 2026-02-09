package com.deskflow.api.controller;

import com.deskflow.api.entity.Mesa;
import com.deskflow.api.repository.IMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesaController {

    @Autowired
    private IMesaRepository mesaRepository;


    @PostMapping
    public Mesa criarMesa(@RequestBody Mesa mesa){
        return mesaRepository.save(mesa);
    }

    @GetMapping
    public List<Mesa> listarMesas(){
        return mesaRepository.findAll();
    }

    @GetMapping("{id}")
    public Mesa buscarMesaPorId(@PathVariable long id){
        return mesaRepository.findById(id).get();
    }

    @PutMapping("{id}")
    public Mesa atualizarMesa(@PathVariable long id, Mesa mesaAtualizada){
        if (mesaRepository.existsById(id)){
            mesaAtualizada.setId(id);
            return mesaRepository.save(mesaAtualizada);
        }
        return null;
    }



}
