package com.java.Polymorphism;

import com.java.Inheritance.Laptop;
import com.java.Inheritance.Product;

public class Main {
    static void main(String[] args) {
        Product product = new Product(1,"product",1000,10,4.5f,100,"Dell","laptop");
        System.out.println(product);

        Laptop laptop = new Laptop(2,"hp laptop",1000,10,4.5f,100,"Dell","laptop",1024,"windows");
        System.out.println(laptop);

        Service service = new Service();

        service.displayDetails(product);

    }

}
