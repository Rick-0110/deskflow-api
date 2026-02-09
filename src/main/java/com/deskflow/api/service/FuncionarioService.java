package com.deskflow.api.service;


import com.deskflow.api.entity.Funcionario;
import com.deskflow.api.repository.IFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private IFuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvarFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario buscarFuncionarioPorId(Long id){

        return funcionarioRepository.findById(id).orElse(null);
    }


    public void deletarFuncionario(Long id){
            funcionarioRepository.deleteById(id);
    }


}
