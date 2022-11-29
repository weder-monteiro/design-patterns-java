package com.example.designpatternsjava.orcamento;

import com.example.designpatternsjava.orcamento.situacao.EmAnalise;
import com.example.designpatternsjava.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicaDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calculaValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprova() {
        this.situacao.aprova(this);
    }

    public void reprova() {
        this.situacao.reprova(this);
    }

    public void finaliza() {
        this.situacao.finaliza(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
