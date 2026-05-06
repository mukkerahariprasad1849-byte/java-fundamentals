package com.java.codingqestions;

import java.util.Scanner;

public class EvenOddDigitCount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;

            }
            number = number / 10;
        }
        System.out.println("evenCount:" + evenCount);
        System.out.println("oddCount:" + oddCount);
        sc.close();
    }
}
