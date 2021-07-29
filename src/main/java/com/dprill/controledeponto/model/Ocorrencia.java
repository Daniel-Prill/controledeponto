package com.dprill.controledeponto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;
}
