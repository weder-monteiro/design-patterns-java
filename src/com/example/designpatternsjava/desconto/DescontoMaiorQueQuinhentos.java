package com.example.designpatternsjava.desconto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQueQuinhentos extends Desconto {

    public DescontoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
