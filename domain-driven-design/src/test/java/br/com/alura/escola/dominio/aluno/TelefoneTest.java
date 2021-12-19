package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.alura.escola.dominio.template.TelefoneTemplate;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comDDD(null).build());

        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comDDD("").build());

        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comDDD("1").build());
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comNumero(null).build());

        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comNumero("").build());

        assertThrows(IllegalArgumentException.class,
                () -> TelefoneTemplate.builder().comNumero("123").build());
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        String ddd = "11";
        String numero = "123456789";

        Telefone telefone = TelefoneTemplate.builder()
                .comDDD(ddd)
                .comNumero(numero)
                .build();

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }

}
