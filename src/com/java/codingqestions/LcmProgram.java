package com.java.codingqestions;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class LcmProgram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();

        int max = Math.max(num1,num2);

        while (true) {
            if (max % num1 == 0 && max % num2 == 0){
                System.out.println("LCM = " + max);
                break;

            }
            max++;
        }
        sc.close();
    }
}
