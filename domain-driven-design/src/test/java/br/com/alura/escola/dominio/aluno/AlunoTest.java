package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.template.AlunoTemplate;
import br.com.alura.escola.dominio.template.TelefoneTemplate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AlunoTest {

    @Test
    void naoDeveriaPermitirAdicinarMaisDoqueDoisTelefones() {
        Telefone telefoneUm = TelefoneTemplate.builder().build();
        Telefone telefoneDois = TelefoneTemplate.builder().build();
        Telefone telefoneTres = TelefoneTemplate.builder().build();

        Aluno aluno = AlunoTemplate.builder().build();
        aluno.adicionarTelefone(telefoneUm.getDdd(), telefoneUm.getNumero());
        aluno.adicionarTelefone(telefoneDois.getDdd(), telefoneDois.getNumero());

        assertThrows(QtdMaximaDeTelefoneAtiginda.class, () -> {
            aluno.adicionarTelefone(telefoneTres.getDdd(), telefoneTres.getNumero());
        });
    }

}
