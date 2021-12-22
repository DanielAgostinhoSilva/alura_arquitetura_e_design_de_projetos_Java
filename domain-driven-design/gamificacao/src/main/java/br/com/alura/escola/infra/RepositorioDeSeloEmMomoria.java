package br.com.alura.escola.infra;

import br.com.alura.escola.dominio.CPF;
import br.com.alura.escola.dominio.RepositorioDeSelos;
import br.com.alura.escola.dominio.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSeloEmMomoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return this.selos.stream()
                .filter(selo -> selo.equals(cpf))
                .collect(Collectors.toList());
    }
}
