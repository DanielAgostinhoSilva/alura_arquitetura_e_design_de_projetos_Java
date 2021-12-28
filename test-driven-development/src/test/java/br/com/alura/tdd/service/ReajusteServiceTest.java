package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.template.FuncionarioTemplate;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void deveria_aplicar_um_reajuste_de_tres_porcento_quando_desepenho_for_a_desejar() {
        ReajusteService serice = new ReajusteService();
        Funcionario funcionario = FuncionarioTemplate.builder()
                .salario(new BigDecimal("1000.00"))
                .build();

        serice.concederReajuste(funcionario, new ReajusteADesejar());

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }
}