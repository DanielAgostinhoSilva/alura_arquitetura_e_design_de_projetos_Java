package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

    @Test
    void deveCriarUmEmailValido(){
        Email email = new Email("test@gmail.com");
        assertEquals("test@gmail.com", email.getEndereco());
    }
}