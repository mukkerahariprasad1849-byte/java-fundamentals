package com.java.codingqestions;

import java.util.Scanner;

public class SumOfNaturalNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum N:");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=N; i++){
             sum = sum + i;
            System.out.println("sum =:" + sum);

        }
        sc.close();

    }
}
