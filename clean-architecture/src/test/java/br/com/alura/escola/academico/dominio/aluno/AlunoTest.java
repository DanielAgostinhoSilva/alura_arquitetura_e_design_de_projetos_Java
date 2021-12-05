package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void beforeEach() {
       aluno  = new Aluno(new CPF("414.648.150-38"), "Fulano", new Email("fulano@test.com"));
    }

    @Test
    public void deveCadastrarUmAlunoComUmTelefone() {
        Telefone telefone = new Telefone("11", "987654321");

        aluno.adicionarTelefone(telefone.getDdd(), telefone.getNumero());

        assertEquals(telefone, aluno.getTelefones().get(0));
    }

    @Test
    public void devePermitirCadastrarDoisTelefone() {
        Telefone telefone = new Telefone("11", "987654321");
        Telefone telefone2 = new Telefone("11", "987654322");

        aluno.adicionarTelefone(telefone.getDdd(), telefone.getNumero());
        aluno.adicionarTelefone(telefone2.getDdd(), telefone2.getNumero());

        assertEquals(telefone, aluno.getTelefones().get(0));
        assertEquals(telefone2, aluno.getTelefones().get(1));
    }

    @Test
    public void naoDevePermitirCadastrarMaisDoQueDoisTelefones() {
        Telefone telefone = new Telefone("11", "987654321");
        Telefone telefone2 = new Telefone("11", "987654322");
        Telefone telefone3 = new Telefone("11", "987654323");

        aluno.adicionarTelefone(telefone.getDdd(), telefone.getNumero());
        aluno.adicionarTelefone(telefone2.getDdd(), telefone2.getNumero());

        assertThrows(LimiteTelefoneAtingido.class, () -> aluno
                .adicionarTelefone(telefone3.getDdd(), telefone3. getNumero()));
    }
}
