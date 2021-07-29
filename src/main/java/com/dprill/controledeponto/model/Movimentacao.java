package com.dprill.controledeponto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {
    
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    @EqualsAndHashCode
    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private MovimentacaoId movimentacaoId;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
