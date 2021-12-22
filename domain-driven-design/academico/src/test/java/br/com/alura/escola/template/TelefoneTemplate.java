package br.com.alura.escola.template;

import br.com.alura.escola.commons.RandomNumberGenerator;
import br.com.alura.escola.dominio.aluno.Telefone;

import java.util.Arrays;
import java.util.List;

public class TelefoneTemplate {
    private static List<String> listaDeDdd = Arrays.asList("11", "12", "13");
    private static List<String> listaDeNumeros = Arrays.asList("999999999", "88888888");

    private String ddd;
    private String numero;

    private TelefoneTemplate(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public static TelefoneTemplate builder() {
        return new TelefoneTemplate(
                listaDeDdd.get(RandomNumberGenerator.randon(0, 2)),
                listaDeNumeros.get(RandomNumberGenerator.randon(0, 1)));
    }

    public TelefoneTemplate comDDD(String ddd){
        this.ddd = ddd;
        return this;
    }

    public TelefoneTemplate comNumero(String numero){
        this.numero = numero;
        return this;
    }

    public TelefoneTemplate comTamanhoOito() {
        this.numero = "88888888";
        return this;
    }

    public TelefoneTemplate comTamanhoNove() {
        this.numero = "999999999";
        return this;
    }

    public Telefone build() {
        return new Telefone(this.ddd, this.numero);
    }

//    public Telefone build() {
//        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.getConfiguration()
//                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
//                .setFieldMatchingEnabled(true);
//
//        return modelMapper.map(this, Telefone.class);
//    }

}
