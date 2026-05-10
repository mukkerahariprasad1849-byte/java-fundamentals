package com.java.Arrays;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;

    public Product(String category, String company, byte discountPercentage, int id, boolean isAvailable, int maxRetailPrice, String name, float rating, int reviewsCount) {
        this.category = category;
        this.company = company;
        this.discountPercentage = discountPercentage;
        this.id = id;
        this.isAvailable = isAvailable;
        this.maxRetailPrice = maxRetailPrice;
        this.name = name;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
    }

    void displayDetails() {
        System.out.println("id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Max Retail Price:" + maxRetailPrice);
        System.out.println("Rating:" + rating);
        System.out.println("Reviews:" + rating);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Is Available:" + isAvailable);
        System.out.println("Company:" + company);
        System.out.println("Category:" + category);
    }
}




