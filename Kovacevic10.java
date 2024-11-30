package com.example;

//Euler problem No.9, answer: 31875000
public class Kovacevic10 {
    public static void main(String[] args) {
        int targetSum = 1000;

        for (int a = 1; a < targetSum / 2; a++) {
            for (int b = a + 1; b < targetSum / 2; b++) {
                int c = targetSum - a - b;

                if (a * a + b * b == c * c) {
                    long product = (long) a * b * c;
                    System.out.println(product);
                }
            }
        }
    }
}
