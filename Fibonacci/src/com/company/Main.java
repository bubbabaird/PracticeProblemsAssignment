package com.company;

public class Main {

    public static void main(String[] args) {
        fibonacci(9);
    }

    public static int[] fibonacci (int number) {
        int[] fib = new int[number];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < number; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
    // The Fibonacci sequence is a pretty sweet numerical sequence that is defined as:
    // fib(n) = fib(n-1) + fib(n-2)
    // ...and fib(0) and fib(1) are both defined as 1. So the Fibonacci sequence
    // starting from the beginning looks like [1, 1, 2, 3, 5, 8, 13,...].
    // Write the fibseq(x) function that returns the first X elements of the
    // Fibonacci sequence.
