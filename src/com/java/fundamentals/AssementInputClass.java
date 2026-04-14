package com.java.fundamentals;

import java.util.Scanner;

public class AssementInputClass {
    static void main() {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Base price:");
                double bestPrice = sc.nextDouble();

                System.out.println("Enter Age:");
                int age = sc.nextInt();

                System.out.println("Enter day (weekday/weekend):");
                String day = sc.next();

                double ageDiscount = 0;

                // Age discount
                if (age < 18) {
                    ageDiscount = 50;
                } else if (age >= 18 && age <= 60) {
                    ageDiscount = 0;
                } else if (age > 60) {
                    ageDiscount = 30;
                }

                double discountAmount = bestPrice * ageDiscount / 100;
                double priceAfterDiscount = bestPrice - discountAmount;

                double finalPrice;

                // Weekend increase
                if (day.equalsIgnoreCase("weekend")) {
                    double increaseAmount = priceAfterDiscount * 20 / 100;
                    finalPrice = priceAfterDiscount + increaseAmount;
                } else {
                    finalPrice = priceAfterDiscount;
                }

                System.out.println("Base price: " + bestPrice);
                System.out.println("Age: " + age);
                System.out.println("Day: " + day);
                System.out.println("Final Price: " + finalPrice);
            }
        }