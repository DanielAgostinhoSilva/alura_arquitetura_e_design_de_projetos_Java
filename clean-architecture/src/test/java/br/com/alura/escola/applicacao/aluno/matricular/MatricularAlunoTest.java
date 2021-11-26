package br.com.alura.escola.applicacao.aluno.matricular;

import br.com.alura.escola.applicacao.matricular.MatricularAluno;
import br.com.alura.escola.applicacao.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlulnosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlulnosEmMemoria repositorio = new RepositorioDeAlulnosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dto = new MatricularAlunoDto("Fulano", "123.456.789-00", "aluno@test.com");
        useCase.executa(dto);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF(dto.getCpfAluno()));
        assertEquals("Fulano", alunoEncontrado.getNome());
    }
}
