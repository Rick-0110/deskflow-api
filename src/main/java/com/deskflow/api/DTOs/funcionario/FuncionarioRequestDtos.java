package com.deskflow.api.DTOs.funcionario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class FuncionarioRequestDtos {

    public static class Request{
        @NotBlank(message = "O nome é obrigatório")
        private String nome;

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "E-mail inválido")
        private String email;

        @NotBlank(message = "O cargo é obrigatório")
        private String cargo;
    }
}
