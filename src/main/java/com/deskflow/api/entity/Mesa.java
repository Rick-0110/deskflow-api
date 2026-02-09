package com.deskflow.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class Mesa {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String codigo;

    private boolean disponivel = true;
}
