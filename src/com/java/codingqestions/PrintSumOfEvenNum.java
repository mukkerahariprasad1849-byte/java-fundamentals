package com.java.codingqestions;

import java.util.Scanner;

public class PrintSumOfEvenNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Even Number N:");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);

            }
        }
            System.out.println("sum of Even numbers:" + sum);
            sc.close();

        }
    }
