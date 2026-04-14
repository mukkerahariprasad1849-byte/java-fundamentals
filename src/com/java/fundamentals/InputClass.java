package com.java.fundamentals;

import java.util.Scanner;

public class InputClass {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        byte age = sc.nextByte();
        System.out.println("Age:" +age);

        System.out.println("Enter marks:" );
        short marks = sc.nextShort();
        System.out.println("Marks:" + marks);

        System.out.println("Password");
        int password = sc.nextInt();
        System.out.println("Password:" + password);

        System.out.println("Mobile Number:");
        long phonenumber = sc.nextLong();
        System.out.println("MObile Number:" + phonenumber);

        System.out.println("Gender");
        char gender = sc.next().charAt(0);
        System.out.println("Gender:" + gender);

        System.out.println("isStockAvailable (true/false):");
        boolean isStockAvailable = sc.nextBoolean();
        System.out.println("isStockAvailable:" + isStockAvailable);

        System.out.println("Discountpercentage:");
        float discountpercentage = sc.nextFloat();
        System.out.println("discountpercenatge:" + discountpercentage);

        System.out.println("Average salary:");
        double averagesalary = sc.nextDouble();
        System.out.println("Average salary:" + averagesalary);
        sc.close();


    }


    }




