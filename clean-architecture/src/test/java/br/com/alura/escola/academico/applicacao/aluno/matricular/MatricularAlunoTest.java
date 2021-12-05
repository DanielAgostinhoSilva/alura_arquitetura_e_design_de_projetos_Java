package br.com.alura.escola.academico.applicacao.aluno.matricular;

import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlulnosEmMemoria;
import br.com.alura.escola.academico.applicacao.matricular.MatricularAluno;
import br.com.alura.escola.academico.applicacao.matricular.MatricularAlunoDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlulnosEmMemoria repositorio = new RepositorioDeAlulnosEmMemoria();
        PublicadorDeEventos publicadorDeEventos = new PublicadorDeEventos();
        MatricularAluno useCase = new MatricularAluno(repositorio, publicadorDeEventos);

        MatricularAlunoDto dto = new MatricularAlunoDto("Fulano", "123.456.789-00", "aluno@test.com");
        useCase.executa(dto);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF(dto.getCpfAluno()));
        assertEquals("Fulano", alunoEncontrado.getNome());
    }
}
