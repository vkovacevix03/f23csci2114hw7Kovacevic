package com.example;

//Euler problem No.14, answer: 837799
public class Kovacevic2 {
    public static void main(String[] args) {
        int limit = 1000000;
        int longestChainLength = 0;
        int startingNumber = 0;

        for (int i = 1; i < limit; i++) {
            int chainLength = collatzChainLength(i);
            if (chainLength > longestChainLength) {
                longestChainLength = chainLength;
                startingNumber = i;
            }
        }

        System.out.println(startingNumber);
    }

    public static int collatzChainLength(long n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }
        return length;
    }
}
