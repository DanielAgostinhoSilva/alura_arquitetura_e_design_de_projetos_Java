package br.com.alura.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;
    private List<Telefone> tefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero) {
        this.tefones.add(new Telefone(ddd, numero));
    }
}