package br.com.alura.escola.dominio.template;

import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.util.RandomNumberGenerator;

import java.util.Arrays;
import java.util.List;

public class CPFTemplate {
    private static List<String> listaDeCPF = Arrays.asList(
            "409.715.790-67",
            "258.314.660-27",
            "532.632.430-04",
            "647.456.520-97"
    );

    private String numero;

    private CPFTemplate(String numero) {
        this.numero = numero;
    }

    public static CPFTemplate builder() {
        return new CPFTemplate(
                listaDeCPF.get(RandomNumberGenerator.randon(0, listaDeCPF.size() - 1))
        );
    }

    public CPFTemplate comNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public CPF build() {
        return new CPF(this.numero);
    }


}
