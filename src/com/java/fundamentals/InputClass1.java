package com.java.fundamentals;

import java.util.Scanner;

public class InputClass1 {
    static void main() {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Product price:");
                double productPrice = sc.nextDouble();

                System.out.println("Enter membership (S/G/B/D):");
                char membership = sc.next().charAt(0);

                System.out.println("Enter Customer age:");
                int age = sc.nextInt();

                double membershipDiscount = 0;
                double ageDiscount = 0;

                // Membership discount
                if (membership == 'G') {
                    membershipDiscount = 20;
                } else if (membership == 'S') {
                    membershipDiscount = 15;
                } else if (membership == 'B') {
                    membershipDiscount = 10;
                } else if (membership == 'D') {
                    membershipDiscount = 50;
                }

                // Age discount
                if (age > 65) {
                    ageDiscount = 10;
                } else if (age >= 45 && age <= 65) {
                    ageDiscount = 8;
                } else if (age >= 25 && age < 45) {
                    ageDiscount = 5;
                } else {
                    ageDiscount = 0;
                }

                double totalDiscount = membershipDiscount + ageDiscount;
                double discountAmount = productPrice * totalDiscount / 100;
                double priceAfterDiscount = productPrice - discountAmount;
                double centralTax = priceAfterDiscount * 2.5 / 100;
                double stateTax = priceAfterDiscount * 2.5 / 100;
                double finalPrice = priceAfterDiscount + centralTax + stateTax;

                System.out.println("\nProduct Price: " + productPrice);
                System.out.println("Membership Type: " + membership);
                System.out.println("Age: " + age);
                System.out.println("Discount Amount: " + discountAmount);
                System.out.println("Price After Discount: " + priceAfterDiscount);
                System.out.println("Central Tax: " + centralTax);
                System.out.println("State Tax: " + stateTax);
                System.out.println("Final Price: " + finalPrice);
            }
        }