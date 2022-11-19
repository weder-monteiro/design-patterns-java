package com.example.designpatternsjava.desconto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto {

    public DescontoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }

}
