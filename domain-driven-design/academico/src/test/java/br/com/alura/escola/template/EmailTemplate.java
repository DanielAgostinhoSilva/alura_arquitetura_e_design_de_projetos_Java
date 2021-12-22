package br.com.alura.escola.template;

import br.com.alura.escola.commons.RandomNumberGenerator;
import br.com.alura.escola.dominio.aluno.Email;

import java.util.Arrays;
import java.util.List;

public class EmailTemplate {
    private static List<String> listaDeEmail = Arrays.asList(
            "pessoa_a001@test.com",
            "pessoa_b001@test.com",
            "pessoa_c001@test.com",
            "pessoa_d001@test.com",
            "pessoa_c001@test.com"
    );

    private String endereco;

    private EmailTemplate(String endereco) {
        this.endereco = endereco;
    }

    public static EmailTemplate builder() {
        return new EmailTemplate(
                listaDeEmail.get(RandomNumberGenerator.randon(0, listaDeEmail.size() - 1))
        );
    }

    public EmailTemplate comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public EmailTemplate comEnderecoNull() {
        this.endereco = null;
        return this;
    }

    public EmailTemplate comEnderecoEmBranco() {
        this.endereco = "";
        return this;
    }

    public EmailTemplate comEnderecoInvalido() {
        this.endereco = "emailinvalido";
        return this;
    }

    public Email build() {
        return new Email(this.endereco);
    }


}
