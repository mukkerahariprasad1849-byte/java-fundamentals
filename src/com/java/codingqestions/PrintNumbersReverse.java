package com.java.codingqestions;

import java.util.Scanner;

public class PrintNumbersReverse {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number N");
        int N = scanner.nextInt();
         for(int i = N; i>=1; i--){
             System.out.println(i);
         }
        scanner.close();

    }
}
