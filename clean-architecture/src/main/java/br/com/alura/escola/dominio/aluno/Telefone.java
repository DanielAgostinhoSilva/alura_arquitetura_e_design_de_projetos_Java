package br.com.alura.escola.dominio.aluno;

import lombok.Getter;

@Getter
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
