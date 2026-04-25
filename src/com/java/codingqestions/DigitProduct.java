package com.java.codingqestions;

import java.util.Scanner;

public class DigitProduct {
    public static int findProduct(int number) {
    int product = 1;

        while (number > 0) {
        int digit = number % 10;
        product = product * digit;
        number = number / 10;
    }

        return product;
}

public static void main(String[] args) {
    int number = 678;
    int result = findProduct(number);
    System.out.println("Product of digits: " + result);
}
}


