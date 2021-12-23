package br.com.alura.escola;

import br.com.alura.escola.aplicacao.GeraSeloAlunoNovato;
import br.com.alura.escola.applicacao.matricular.MatricularAluno;
import br.com.alura.escola.applicacao.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.RepositorioDeSelos;
import br.com.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.infra.RepositorioDeSeloEmMomoria;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDecomando {
    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        RepositorioDeSelos repositorioDeSelos = new RepositorioDeSeloEmMomoria();

        LogDeAlunoMatriculado logDeAlunoMatriculado = new LogDeAlunoMatriculado();
        GeraSeloAlunoNovato geraSeloAlunoNovato = new GeraSeloAlunoNovato(repositorioDeSelos);

        publicador.adicionar(logDeAlunoMatriculado);
        publicador.adicionar(geraSeloAlunoNovato);

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repositorioDeAlunos, publicador);

        matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));

    }
}
