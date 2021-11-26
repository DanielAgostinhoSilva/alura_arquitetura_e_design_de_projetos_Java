package br.com.alura.escola.dominio.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> tefones = new ArrayList<>();
    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.tefones.add(new Telefone(ddd, numero));
    }
}
