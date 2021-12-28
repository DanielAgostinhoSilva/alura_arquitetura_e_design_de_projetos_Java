package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.template.FuncionarioTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    private BonusService service;

    @BeforeEach
    public void inicialiar() {
        this.service = new BonusService();
    }

    @Test
    void deve_retornar_um_bonus_com_valor_zero_quando_o_salario_for_muito_alto() {
        Funcionario funcionario = FuncionarioTemplate.builder().comSalarioMuitoAlto().build();

        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(funcionario));
    }

    @Test
    void deve_retornar_um_bonus_de_10_porcento_do_salario_quando_o_salario_nao_for_muito_alto() {
        Funcionario funcionario = FuncionarioTemplate.builder()
                .salario(new BigDecimal("10000.00"))
                .build();

        BigDecimal bonus = service.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}