package com.example.designpatternsjava.orcamento.situacao;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void finaliza(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
