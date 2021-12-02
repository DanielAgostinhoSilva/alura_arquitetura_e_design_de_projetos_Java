package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.Evento;
import lombok.Getter;

import java.time.LocalDateTime;


public class AlunoMatriculado implements Evento {

    @Getter
    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return momento;
    }
}
