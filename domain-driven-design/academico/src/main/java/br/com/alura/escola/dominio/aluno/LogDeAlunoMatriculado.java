package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.evento.Evento;
import br.com.alura.escola.dominio.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(String.format(
                "Aluno com CPF %s matriculado em: %s",
                ((AlunoMatriculado) evento).getCpfDoAluno().getNumero(),
                momentoFormatado
        ));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
