package com.java.codingqestions;

import java.util.Scanner;

public class PrintMultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiplication N:");
        int N = sc.nextInt();
        for(int i = 1; i<=10; i++){
           int  result = N * i;
            System.out.println(N + "x" + i + "=" + result);
        }
        sc.close();

    }
}
