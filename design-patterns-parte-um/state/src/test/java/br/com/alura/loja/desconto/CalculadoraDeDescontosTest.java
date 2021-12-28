package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeDescontosTest {

    private CalculadoraDeDescontos calculadora;

    @BeforeEach
    public void setUp() {
        this.calculadora = new CalculadoraDeDescontos();
    }

    @Test
    public void deve_aplicar_um_desconto_de_10_porcento_quando_quantidade_de_item_for_maior_que_5() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),  6);

        BigDecimal desconto = calculadora.calcular(orcamento);

        assertEquals(new BigDecimal("10.00"), desconto);
    }

    @Test
    public void nao_deve_aplicar_desconto_quando_quantidade_de_item_for_menor_ou_igual_a_5() {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),  5);

        BigDecimal desconto = calculadora.calcular(orcamento);

        assertEquals(BigDecimal.ZERO, desconto);
    }

    @Test
    public void deve_aplicar_um_desconto_de_10_porcento_quando_o_valor_do_orcamento_for_mario_que_500() {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"),  5);

        BigDecimal desconto = calculadora.calcular(orcamento);

        assertEquals(new BigDecimal("60.00"), desconto);
    }

    @Test
    public void nao_deve_aplicar_desconto_quando_valor_do_orcamento_for_menor_ou_igual_a_500() {
        Orcamento orcamento = new Orcamento(new BigDecimal("500"),  5);

        BigDecimal desconto = calculadora.calcular(orcamento);

        assertEquals(BigDecimal.ZERO, desconto);
    }
}
