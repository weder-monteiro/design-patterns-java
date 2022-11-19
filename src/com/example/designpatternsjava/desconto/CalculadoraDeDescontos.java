package com.example.designpatternsjava.desconto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcula(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoMaisDeCincoItens(
            new DescontoMaiorQueQuinhentos(
                new SemDesconto()
            )
        );

        return cadeiaDeDescontos.calcula(orcamento);
    }

}
