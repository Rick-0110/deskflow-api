package com.deskflow.api.repository;

import com.deskflow.api.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
