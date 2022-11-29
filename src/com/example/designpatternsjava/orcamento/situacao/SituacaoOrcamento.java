package com.example.designpatternsjava.orcamento.situacao;

import com.example.designpatternsjava.DomainException;
import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprova(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprova(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finaliza(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }

}
