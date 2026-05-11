package com.java.Static;

public class Main {
    static void main(String[] args) {
        System.out.println(Product.VENDOR_NAME);
        Product product = new Product(1,"laptop",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        System.out.println(product.id);

        Product product1 = new Product(2,"laptop2",3423,4.5f,23423,(byte)10,true,"lenovo", "laptop");
        System.out.println(product1.id);

        Product.displayVendorDetails();

        System.out.println(Product.VENDOR_NAME);
        System.out.println(product.VENDOR_NAME);
    }

}
