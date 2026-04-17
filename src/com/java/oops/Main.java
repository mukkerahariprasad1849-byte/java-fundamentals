package com.java.oops;

public class Main {
    static void main() {
        Product p1;
        p1= new Product();
        p1.id = 101;
        p1.name = "i Qz9 s pro";
        p1.maxRetailPrice = 79999.00;
        p1.discountPercentage = 10.0f;
        p1.isAvailable = true;
        p1.stateTax = 0.9f;
        p1.centralTax = 0.8f;

        System.out.println("id:" + p1.id);
        System.out.println("name:" + p1.name);
        System.out.println("maxRetailPrice:" +  p1.maxRetailPrice);
        System.out.println("discountPercentage:" + p1.discountPercentage);
        System.out.println("isAvailable:" + p1.isAvailable);
        System.out.println("stateTax:" + p1.stateTax);
        System.out.println("centralTax:" + p1.centralTax);



    }
}
