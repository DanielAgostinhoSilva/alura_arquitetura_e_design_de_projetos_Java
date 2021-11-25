package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveCriarUmTelefoneComDDDInvalidoOuNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "998765432"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "998765432"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("dddinvalido", "998765432"));

        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "telefoneinvalido "));
    }

    @Test
    void deveCriarUmTelefoneValido() {
        Telefone telefone = new Telefone("11", "987654321");
        assertEquals("11", telefone.getDdd());
        assertEquals("987654321", telefone.getNumero());
    }

}