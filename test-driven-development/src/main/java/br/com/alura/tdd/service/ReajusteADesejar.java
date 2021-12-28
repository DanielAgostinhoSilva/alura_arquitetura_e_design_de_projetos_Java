package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteADesejar implements Reajuste{

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.03")).setScale(2, RoundingMode.HALF_UP);
    }
}
