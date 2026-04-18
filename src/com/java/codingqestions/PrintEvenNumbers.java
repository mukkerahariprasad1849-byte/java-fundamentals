package com.java.codingqestions;

import java.util.Scanner;

public class PrintEvenNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0){
                System.out.println(i);
        }
    }
    sc.close();
}
}


