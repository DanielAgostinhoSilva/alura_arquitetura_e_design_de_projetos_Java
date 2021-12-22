package br.com.alura.escola.dominio.aluno;

public class QtdMaximaDeTelefoneAtiginda extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QtdMaximaDeTelefoneAtiginda(Telefone telefone) {
		super(String.format(
				"Nao e possivel cadastrar o telefone %s, o numero maximo de telefone" +
						"ja foi atingido", telefone.getTelefoneCompleto()
		));
	}

}
