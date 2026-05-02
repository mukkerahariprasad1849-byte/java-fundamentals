package com.java.codingqestions;

import java.util.Scanner;

public class ProuductOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int product = 1;

            while (number > 0) {
                int digit = number % 10;   // get last digit
                product = product * digit; // multiply
                number = number / 10;      // remove last digit
            }

            System.out.println("Product of digits = " + product);
        }
    }

