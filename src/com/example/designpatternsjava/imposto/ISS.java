package com.example.designpatternsjava.imposto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
