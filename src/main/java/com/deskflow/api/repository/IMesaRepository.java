package com.deskflow.api.repository;

import com.deskflow.api.entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMesaRepository extends JpaRepository <Mesa, Long> {
}
