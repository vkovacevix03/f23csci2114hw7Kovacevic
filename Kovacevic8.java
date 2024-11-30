package com.example;

//Euler Problem No.5, answer: 232792560
public class Kovacevic8 {
    public static void main(String[] args) {
        int limit = 20;
        long lcm = 1;

        for (int i = 1; i <= limit; i++) {
            lcm = lcm(lcm, i);
        }

        System.out.println(lcm);

    }

    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
