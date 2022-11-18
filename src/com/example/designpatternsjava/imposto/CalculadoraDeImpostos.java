package com.example.designpatternsjava.imposto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcula(Orcamento orcamento, TipoImpostoEnum tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }

}
