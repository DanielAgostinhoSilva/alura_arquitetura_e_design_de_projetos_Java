package br.com.alura.escola.template;

import br.com.alura.escola.commons.CPFTemplate;
import br.com.alura.escola.commons.RandomNumberGenerator;
import br.com.alura.escola.dominio.aluno.Aluno;

import java.util.Arrays;
import java.util.List;

public class AlunoTemplate {
    private static List<String> alunos = Arrays.asList(
            "Ryunas",
            "Coavao",
            "Kiopos",
            "Aslail",
            "Dyalyu",
            "Soanlo"
    );

    private Aluno aluno;

    private AlunoTemplate(Aluno aluno) {
        this.aluno = aluno;
    }

    public static AlunoTemplate builder() {
        return new AlunoTemplate(
                new Aluno(
                        CPFTemplate.builder().build(),
                        alunos.get(RandomNumberGenerator.randon(0, alunos.size() - 1)),
                        EmailTemplate.builder().build()
                )
        );
    }

    public Aluno build() {
        return aluno;
    }


}
