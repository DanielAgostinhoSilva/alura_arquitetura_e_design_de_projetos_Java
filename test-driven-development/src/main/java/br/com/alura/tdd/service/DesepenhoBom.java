package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DesepenhoBom implements Reajuste{

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.15")).setScale(2, RoundingMode.HALF_UP);
    }
}
