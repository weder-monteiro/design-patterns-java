package com.example.designpatternsjava.orcamento.situacao;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprova(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    public void reprova(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
