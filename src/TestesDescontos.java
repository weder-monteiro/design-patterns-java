import com.example.designpatternsjava.desconto.CalculadoraDeDescontos;
import com.example.designpatternsjava.imposto.CalculadoraDeImpostos;
import com.example.designpatternsjava.imposto.ICMS;
import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcula(primeiro));
        System.out.println(calculadoraDeDescontos.calcula(segundo));
    }
}