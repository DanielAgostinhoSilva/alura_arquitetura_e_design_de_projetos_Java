package br.com.alura.escola.util;

import java.util.Random;

public class RandomNumberGenerator {

    public static int randon(int min, int max) {
        return new Random()
                .ints(min, max + 1)
                .iterator()
                .next();
    }
}
