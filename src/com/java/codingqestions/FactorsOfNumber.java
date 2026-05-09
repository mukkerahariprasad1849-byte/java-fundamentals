package com.java.codingqestions;

import java.util.Scanner;

public class FactorsOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        System.out.println("Factors are :");
          for(int i = 1; i<= number; i++) {
              if (number % i == 0) {
                  System.out.println(i);
              }

        }
          sc.close();

    }
}
