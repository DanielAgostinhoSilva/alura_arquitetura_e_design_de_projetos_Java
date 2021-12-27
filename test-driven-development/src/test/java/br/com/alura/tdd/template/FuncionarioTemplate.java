package br.com.alura.tdd.template;

import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioTemplate {
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    private FuncionarioTemplate(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public static FuncionarioTemplate builder() {
        return new FuncionarioTemplate("Fulano da Silva", LocalDate.now(), new BigDecimal("1100"));
    }

    public FuncionarioTemplate nome(String nome) {
        this.nome = nome;
        return this;
    }

    public FuncionarioTemplate dataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
    }

    public FuncionarioTemplate salario(BigDecimal salario) {
        this.salario = salario;
        return this;
    }

    public FuncionarioTemplate comSalarioMuitoAlto() {
        this.salario = new BigDecimal("25000.00");
        return this;
    }

    public Funcionario build(){
        return new Funcionario(nome, dataAdmissao, salario);
    }
}
