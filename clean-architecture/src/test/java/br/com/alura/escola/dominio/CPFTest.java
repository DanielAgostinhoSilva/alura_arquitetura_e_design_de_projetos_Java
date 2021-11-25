package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveCriarUmCPFComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("cpfinvalido"));
    }

    @Test
    void deveCriarCPFValido() {
        CPF cpf = new CPF("414.648.150-38");
        assertEquals("414.648.150-38", cpf.getNumero());
    }

}