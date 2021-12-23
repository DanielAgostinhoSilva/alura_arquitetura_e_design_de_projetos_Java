package br.com.alura.escola.aplicacao;

import br.com.alura.escola.dominio.CPF;
import br.com.alura.escola.dominio.RepositorioDeSelos;
import br.com.alura.escola.dominio.Selo;
import br.com.alura.escola.dominio.evento.Evento;
import br.com.alura.escola.dominio.evento.Ouvinte;
import br.com.alura.escola.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        System.out.println("Gerando selo");
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Novato");
        this.repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
