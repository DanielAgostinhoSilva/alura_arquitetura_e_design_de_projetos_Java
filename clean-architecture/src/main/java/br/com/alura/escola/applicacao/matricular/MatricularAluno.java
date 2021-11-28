package br.com.alura.escola.applicacao.matricular;

import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public void executa(MatricularAlunoDto dados) {
        Aluno alunoNovo = dados.criarAluno();
        repositorio.matricular(alunoNovo);
        AlunoMatriculado matriculado = new AlunoMatriculado(alunoNovo.getCpf());
        publicador.publicar(matriculado);
    }
}
