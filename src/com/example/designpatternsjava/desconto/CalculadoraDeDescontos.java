package com.example.designpatternsjava.desconto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcula(Orcamento orcamento) {
        Desconto desconto = new DescontoMaisDeCincoItens(
            new DescontoMaiorQueQuinhentos(
                new SemDesconto()
            )
        );

        return desconto.calcula(orcamento);
    }

}
