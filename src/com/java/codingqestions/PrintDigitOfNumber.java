package com.java.codingqestions;

import java.util.Scanner;

public class PrintDigitOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit of a Number N:");
        int N = sc.nextInt();
        while (N > 0) {
           int digit = N % 10;
            System.out.println(digit);
            N = N / 10;

        }
        sc.close();

    }
}
