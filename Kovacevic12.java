package com.example;

import java.math.BigInteger;

//Euler problem no.15, answer: 137846528820
public final class Kovacevic12 {

    public static void main(String[] args) {
        System.out.println(new Kovacevic12().run());
    }

    private static final int GRID_SIZE = 20;

    public String run() {
        return binomialCoefficient(2 * GRID_SIZE, GRID_SIZE).toString();
    }

    private static BigInteger binomialCoefficient(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }

        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;

        for (int i = 1; i <= k; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(n - i + 1));
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        return numerator.divide(denominator);
    }
}
