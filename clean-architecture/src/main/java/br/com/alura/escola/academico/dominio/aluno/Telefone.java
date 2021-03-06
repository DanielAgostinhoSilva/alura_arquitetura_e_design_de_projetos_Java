package br.com.alura.escola.academico.dominio.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null || !ddd.matches("[0-9]{2}")) {
           throw new IllegalArgumentException("ddd invalido!");
        }

        if(numero == null || !numero.matches("([0-9]{9}|[0-9]{8})")) {
            throw new IllegalArgumentException("numero invalido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}
