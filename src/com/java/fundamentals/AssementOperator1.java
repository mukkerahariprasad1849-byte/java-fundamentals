package com.java.fundamentals;

import java.util.Scanner;

public class AssementOperator1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product price:");
        int productPrice = sc.nextInt();
        System.out.println("Enter discountPercentage:");
        double discountPercentage = sc.nextDouble();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        double totalPrice = productPrice * quantity;
        double discountAmount = totalPrice * discountPercentage / 100;
        double priceAfterDiscount = totalPrice - discountAmount;
        double stateTaxAmount = priceAfterDiscount * 2.5 / 100;
        double centralTaxAmount = priceAfterDiscount * 2.5 / 100;

        double finalBill = priceAfterDiscount + stateTaxAmount + centralTaxAmount;
        double savedAmount = discountAmount;
        double totalSaved = savedAmount;
        System.out.println("proudcutPrice:" + productPrice);
        System.out.println("discountPercenatge:" + discountPercentage);
        System.out.println("quantity:" + quantity);
        System.out.println("finalaprice:" + totalPrice);
        System.out.println("savedAmount:" + savedAmount);
        System.out.println("finalBill:" + finalBill);
        System.out.println("totalSaved:" + totalSaved);




    }


    }

