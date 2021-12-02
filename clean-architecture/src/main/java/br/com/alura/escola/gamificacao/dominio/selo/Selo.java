package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.academico.dominio.aluno.CPF;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Selo {
    private CPF cpfDoAluno;
    private String nome;


}
