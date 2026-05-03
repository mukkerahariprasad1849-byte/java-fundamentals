package com.java.codingqestions;

import javax.swing.*;
import java.util.Scanner;

public class PalindromeCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (reverse == original) {
            System.out.println("Palindrome:");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
