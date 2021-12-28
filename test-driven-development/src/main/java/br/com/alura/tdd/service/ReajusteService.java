package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Reajuste reajuste) {
        BigDecimal aumento = reajuste.calcular(funcionario.getSalario());
        funcionario.reajustarSalario(aumento);
    }
}
