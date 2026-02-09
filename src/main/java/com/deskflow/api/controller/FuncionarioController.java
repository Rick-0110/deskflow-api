package com.deskflow.api.controller;


import com.deskflow.api.entity.Funcionario;
import com.deskflow.api.repository.IFuncionarioRepository;
import com.deskflow.api.service.FuncionarioService;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario criarFuncionario(@RequestBody @Valid Funcionario funcionario) {
        return funcionarioService.salvarFuncionario(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionario();
    }

    @GetMapping("{id}")
    public ResponseEntity<Funcionario> buscarPorId(@PathVariable long id) {
       Funcionario funcionario = funcionarioService.buscarFuncionarioPorId(id);

       if(funcionario == null){
           System.out.println("Funcionario não existe!");
           return ResponseEntity.notFound().build();
       }

       return ResponseEntity.ok(funcionario);
    }

    @PutMapping("{id}")
    public Funcionario atualizarFuncionario(@PathVariable long id, @RequestBody Funcionario funcionarioAtualizado) {
       Funcionario existente = funcionarioService.buscarFuncionarioPorId(id);
       if(existente != null){
           funcionarioAtualizado.setId(id);
           return funcionarioService.salvarFuncionario(funcionarioAtualizado);
       }
       return null;
    }

    @DeleteMapping("{id}")
    public String deletarFuncionario(@PathVariable long id){

    funcionarioService.deletarFuncionario(id);
    return "Funcionário deletado com sucesso!";

    }
}


