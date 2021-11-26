package br.com.alura.escola.applicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno alunoNovo = dados.criarAluno();
        repositorio.matricular(alunoNovo);
    }
}
