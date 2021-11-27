package br.com.alura.escola.dominio.aluno;

import java.util.List;

public class LimiteTelefoneAtingido extends RuntimeException{

    public LimiteTelefoneAtingido(List<Telefone> telefones) {
        super("Limite maximo permitido de telefones atingida " + telefones);
    }
}
