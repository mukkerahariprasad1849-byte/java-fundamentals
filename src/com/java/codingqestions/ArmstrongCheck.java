package com.java.codingqestions;

import java.util.Scanner;

public class ArmstrongCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        int original = number;
        int temp = number;
        int count = 0;
        int sum = 0;

        while (temp > 0){
            temp = temp / 10 ;
            count++;

        }
        while (number > 0){
            int digit = number % 10;
             sum += (int) Math.pow(digit, count);
            number = number / 10;

        }
        if(sum == original) {
            System.out.println("Armstrong:");

        }else {
            System.out.println("Not Armstrong:");
        }
        sc.close();
    }
}
