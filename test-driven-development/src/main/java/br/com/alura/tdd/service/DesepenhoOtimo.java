package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DesepenhoOtimo implements Reajuste{

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.20")).setScale(2, RoundingMode.HALF_UP);
    }
}
