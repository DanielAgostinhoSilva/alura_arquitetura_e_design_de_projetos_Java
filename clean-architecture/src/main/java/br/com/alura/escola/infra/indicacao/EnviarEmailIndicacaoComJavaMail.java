package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.applicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        // logica de envio de emails coma a lib Java Mail
    }
}