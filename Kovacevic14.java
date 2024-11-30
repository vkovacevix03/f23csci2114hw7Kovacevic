package com.example;

//Euler problem No.12, asnwer: 76576500
public final class Kovacevic14 {

    public static void main(String[] args) {
        System.out.println(new Kovacevic14().run());
    }

    public String run() {
        int triangle = 0;
        for (int i = 1;; i++) {
            if (Integer.MAX_VALUE - triangle < i) {
                throw new ArithmeticException("Overflow");
            }
            triangle += i;
            if (countDivisors(triangle) > 500) {
                return Integer.toString(triangle);
            }
        }
    }

    private static int countDivisors(int n) {
        int count = 0;
        int end = sqrt(n);
        for (int i = 1; i <= end; i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if (end * end == n) {
            count--;
        }
        return count;
    }

    private static int sqrt(int n) {
        return (int) Math.sqrt(n);
    }
}
