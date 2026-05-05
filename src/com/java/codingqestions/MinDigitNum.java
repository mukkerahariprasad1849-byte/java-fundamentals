package com.java.codingqestions;

import java.util.Scanner;

public class MinDigitNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int number = sc.nextInt();
        int min = number % 10;
        while (number > 0){
            int digit = number % 10;
            if (digit < min ) {
                min = digit;

            }
            number = number / 10;

        }
        System.out.println(min);
    }
}
