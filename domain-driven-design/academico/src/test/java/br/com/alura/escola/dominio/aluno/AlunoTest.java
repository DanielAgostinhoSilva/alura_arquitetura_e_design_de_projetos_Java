package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.template.AlunoTemplate;
import br.com.alura.escola.template.TelefoneTemplate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlunoTest {

    @Test
    void deveriaPermiterAdicionarUmTelefone(){
        Telefone telefoneUm = TelefoneTemplate.builder().build();

        Aluno aluno = AlunoTemplate.builder().build();
        aluno.adicionarTelefone(telefoneUm.getDdd(), telefoneUm.getNumero());

        assertEquals(1, aluno.getTelefones().size());
    }

    @Test
    void deveriaPermiterAdicionarDoisTelefones(){
        Telefone telefoneUm = TelefoneTemplate.builder().build();
        Telefone telefoneDois = TelefoneTemplate.builder().build();

        Aluno aluno = AlunoTemplate.builder().build();
        aluno.adicionarTelefone(telefoneUm.getDdd(), telefoneUm.getNumero());
        aluno.adicionarTelefone(telefoneDois.getDdd(), telefoneDois.getNumero());

        assertEquals(2, aluno.getTelefones().size());
    }

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
