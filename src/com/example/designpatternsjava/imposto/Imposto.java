package com.example.designpatternsjava.imposto;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcula(Orcamento orcamento);

}
