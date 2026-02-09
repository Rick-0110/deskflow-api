package com.deskflow.api.DTOs.funcionario;

import com.deskflow.api.entity.Funcionario;

public class FuncionarioResponseDtos {
    private long id;
    private String nome;
    private String email;
    private String cargo;

public FuncionarioResponseDtos(Funcionario funcionario){
    this.id = funcionario.getId();
    this.nome = funcionario.getNome();
    this.email = funcionario.getEmail();
    this.cargo = funcionario.getCargo();
}

}
