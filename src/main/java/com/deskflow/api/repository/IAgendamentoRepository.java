package com.deskflow.api.repository;

import com.deskflow.api.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
