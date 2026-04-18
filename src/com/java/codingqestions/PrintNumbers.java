package com.java.codingqestions;

import java.util.Scanner;

public class PrintNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int N = sc.nextInt();
        for( int i = 1; i<=N; i++){
            System.out.println(i);
        }
        sc.close();
    }


}
