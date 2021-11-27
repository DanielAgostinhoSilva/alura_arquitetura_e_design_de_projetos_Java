package br.com.alura.escola.dominio.aluno;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {

        if(telefones.size() == 2) {
            throw new LimiteTelefoneAtingido(telefones);
        }

        this.telefones.add(new Telefone(ddd, numero));
    }
}
