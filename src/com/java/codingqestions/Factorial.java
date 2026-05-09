package com.java.codingqestions;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int N = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=N; i++){
            fact = fact * i;
        }
        System.out.println("Factorial:" + fact);

        sc.close();
    }
}
