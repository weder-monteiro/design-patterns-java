package com.example.designpatternsjava.orcamento.situacao;

import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    public void finaliza(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
