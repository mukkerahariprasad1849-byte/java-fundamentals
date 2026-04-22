package com.java.codingqestions;

import java.util.Scanner;

public class ReverseOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N");
        int Num = sc.nextInt();
        int reverse = 0;
        while ( Num > 0){
          int  digit = Num % 10;
          reverse = reverse * 10 + digit;
          Num = Num / 10;
        }
        System.out.println("Reverse Number:" + reverse);

    }
}
