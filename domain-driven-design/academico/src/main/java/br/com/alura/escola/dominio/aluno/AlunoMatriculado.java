package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.CPF;
import br.com.alura.escola.dominio.evento.Evento;
import br.com.alura.escola.dominio.evento.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

//    public LocalDateTime momento() {
//        return this.momento;
//    }
//
//    public TipoDeEvento tipo() {
//        return TipoDeEvento.ALUNO_MATRICULADO;
//    }
//
//    public Map<String, Object> informacoes() {
//        return Map.of("cpf", this.cpfDoAluno);
//    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", this.cpfDoAluno);
    }
}
