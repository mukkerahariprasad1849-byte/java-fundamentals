package com.java.Arrays;

public class ProductsArrayTest {
    static void main() {
        Product[] products = new Product[]{

                new Product("1", "Laptop1", (byte)10, 3423, true, 23423, "Laptop", 4.5f, 50000),

                new Product("2", "Laptop2", (byte)11, 3000, true, 20000, "Laptop", 4.2f, 45000),

                new Product("3", "Laptop3", (byte)12, 2500, false, 15000, "Laptop", 4.0f, 40000),

                new Product("4", "Laptop4", (byte)13, 4000, true, 50000, "Laptop", 4.8f, 60000),

                new Product("5", "Laptop5", (byte)14, 3500, true, 30000, "Laptop", 4.6f, 55000)
        };

        for (Product product : products) {
            product.displayDetails();
        }
    }
}