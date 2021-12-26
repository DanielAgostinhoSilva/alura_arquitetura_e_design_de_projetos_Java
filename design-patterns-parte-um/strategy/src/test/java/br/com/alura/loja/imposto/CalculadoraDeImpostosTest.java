package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeImpostosTest {

    @Test
    public void deveCalcularImpostoICMS() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        BigDecimal impostoCalculado = calculadora.calcular(orcamento, new ICMS());

        assertEquals(new BigDecimal("10.00"), impostoCalculado);
    }

    @Test
    public void deveCalcularImpostoISS() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        BigDecimal impostoCalculado = calculadora.calcular(orcamento, new ISS());

        assertEquals(new BigDecimal("6.00"), impostoCalculado);
    }
}
