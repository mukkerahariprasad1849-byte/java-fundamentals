package com.java.Polymorphism;


import com.java.Inheritance.Laptop;
import com.java.Inheritance.Product;

public class Service {
    public Product add (Product product){
        System.out.println("Service: " + product);
        return product;
    }
    public Laptop add( Laptop laptop){
        return laptop;

    }
    public double add(double a, double b){
        return a + b;

    }
    public boolean add( int index, Product product){
        return true;
    }

    public void displayDetails(Product product){
        product.displayDetails();
    }



}
