package com.example;

//Euler problem No.6, answer: 25164150
public class Kovacevic9 {
    public static void main(String[] args) {
        int limit = 100;
        long sumOfSquares = 0;
        long sum = 0;

        for (int i = 1; i <= limit; i++) {
            sumOfSquares += (long) i * i;
            sum += i;
        }

        long squareOfSum = sum * sum;
        long difference = squareOfSum - sumOfSquares;

        System.out.println(difference);
    }
}
