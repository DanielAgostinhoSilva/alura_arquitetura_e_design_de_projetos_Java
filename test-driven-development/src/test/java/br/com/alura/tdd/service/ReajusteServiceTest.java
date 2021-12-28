package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.template.FuncionarioTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.security.Provider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;

    @BeforeEach
    public void inicializar() {
        this.service = new ReajusteService();
    }

    @Test
    public void deveria_aplicar_um_reajuste_de_tres_porcento_quando_desepenho_for_a_desejar() {
        Funcionario funcionario = FuncionarioTemplate.builder()
                .salario(new BigDecimal("1000.00"))
                .build();

        service.concederReajuste(funcionario, new DesepenhoADesejar());

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void deveria_aplicar_um_reajuste_de_quinze_porcento_quando_desepenho_for_bom() {
        Funcionario funcionario = FuncionarioTemplate.builder()
                .salario(new BigDecimal("1000.00"))
                .build();

        service.concederReajuste(funcionario, new DesepenhoBom());

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void deveria_aplicar_um_reajuste_de_vinte_porcento_quando_desepenho_for_otimo() {
        Funcionario funcionario = FuncionarioTemplate.builder()
                .salario(new BigDecimal("1000.00"))
                .build();

        service.concederReajuste(funcionario, new DesepenhoOtimo());

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
