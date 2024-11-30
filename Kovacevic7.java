package com.example;

//Euler problem No.16, answer: 
import java.math.BigInteger;

public class Kovacevic7 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(2).pow(1000);

        String numberString = number.toString();
        int sumOfDigits = 0;

        for (int i = 0; i < numberString.length(); i++) {
            sumOfDigits += Character.getNumericValue(numberString.charAt(i));
        }

        System.out.println(sumOfDigits);
    }
}
