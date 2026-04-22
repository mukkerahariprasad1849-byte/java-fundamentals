package com.java.codingqestions;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int Number = sc.nextInt();
        int sum = 0;
        while ( Number > 0 ){
            int digit = Number / 10;
            sum = sum + digit;
            Number = Number / 10;

        }
        System.out.println("Sum of the digit:" + sum);

    }
}
