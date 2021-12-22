package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.template.EmailTemplate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> EmailTemplate.builder().comEnderecoNull().build());

		assertThrows(IllegalArgumentException.class,
				() -> EmailTemplate.builder().comEnderecoEmBranco().build());

		assertThrows(IllegalArgumentException.class,
				() -> EmailTemplate.builder().comEnderecoInvalido().build());
	}

	@Test
	void deveriaPermitirCriarEmailComEnderecoValido() {
		String endereco = "fulano@alura.com.br";
		Email email = EmailTemplate.builder().comEndereco(endereco).build();
		assertEquals(endereco, email.getEndereco());
	}

}
