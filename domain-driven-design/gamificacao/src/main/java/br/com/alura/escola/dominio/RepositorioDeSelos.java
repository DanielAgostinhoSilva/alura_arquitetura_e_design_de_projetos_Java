package br.com.alura.escola.dominio;

import java.util.List;

public interface RepositorioDeSelos {
    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
