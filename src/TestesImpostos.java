import com.example.designpatternsjava.imposto.CalculadoraDeImpostos;
import com.example.designpatternsjava.imposto.ICMS;
import com.example.designpatternsjava.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcula(orcamento, new ICMS()));
    }
}