package com.java.fundamentals;

import java.util.Scanner;

public class AssementOperator2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter productPrice:");
        int productPrice = sc.nextInt();
        System.out.println("Enter MembershipType (S/G/D):");
        char memberShipType = sc.next().charAt(0);
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        double memberShipTypeDisount = 0;
        int shippingCharges = 100;

        if(memberShipType == 'S' || memberShipType == 's'){
            memberShipTypeDisount = 10;
            shippingCharges = 50;
        } else if (memberShipType == 'G' || memberShipType == 'g') {
            memberShipTypeDisount = 15;
            shippingCharges = 20;
        } else if (memberShipType == 'D' || memberShipType == 'd') {
            memberShipTypeDisount = 20;
            shippingCharges = 0;
        } else {
            memberShipType = 0;
            shippingCharges = 100;
        }
          double totalprice = productPrice * quantity;
            double discountAmount = totalprice * memberShipTypeDisount /100;
            double discountedPrice = discountAmount - totalprice;
            double stateTax = discountedPrice * 2.5 /100;
            double centralTax = discountedPrice *2.5 / 100;
            double finalBill =  discountedPrice + stateTax + centralTax + shippingCharges;
            double totalSaving = discountAmount;

            System.out.println("productPrice:" + productPrice);
            System.out.println("Disocuntamount:" + discountAmount);
            System.out.println("Final bill amount:" + finalBill);
            System.out.println("TotalAmountsaved:"+ totalSaving);

        }


    }

