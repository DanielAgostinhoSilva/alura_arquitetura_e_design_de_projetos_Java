package br.com.alura.escola.dominio;

import br.com.alura.escola.commons.CPFTemplate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> CPFTemplate.builder().comNumero(null).build());

		assertThrows(IllegalArgumentException.class,
				() -> CPFTemplate.builder().comNumero("").build());

		assertThrows(IllegalArgumentException.class,
				() -> CPFTemplate.builder().comNumero("12345678900").build());
	}

	@Test
	void deveriaPermitirCriarCPFComNumeroValido() {
		String numero = "123.456.789-00";
		CPF cpf = CPFTemplate.builder().comNumero(numero).build();
		assertEquals(numero, cpf.getNumero());
	}

}
