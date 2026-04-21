package com.java.codingqestions;

import java.util.Scanner;

public class PrintNumberOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of digits  N :");
        int N = sc.nextInt();
        int count = 0;
        while (N > 0){
            N = N / 10;
            count = count + 1;


        }
        System.out.println("Number of digits:" + count);
        sc.close();

    }
}
