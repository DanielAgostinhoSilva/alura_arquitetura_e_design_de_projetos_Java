package br.com.alura.escola.academico.applicacao.indicacao;

import br.com.alura.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
