package com.example.designpatternsjava.imposto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }

}
