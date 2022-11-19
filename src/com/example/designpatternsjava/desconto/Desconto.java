package com.example.designpatternsjava.desconto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcula(Orcamento orcamento) {
        if(deveAplicar(orcamento)) {
            return efetuaCalculo(orcamento);
        }

        return proximo.calcula(orcamento);
    }

    protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);

    protected abstract boolean deveAplicar(Orcamento orcamento);
}
