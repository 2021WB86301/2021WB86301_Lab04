package com.bits;
public class App {
    public static void main(String[] args) {
        System.out.println("DevOps Lab M4 - 2021WB86301 - Java 21 - Product Scenario");
        Product p1 = new Product(101, "Laptop", 55000.0);
        Product p2 = new Product(102, "Mouse", 500.0);
        p1.display();
        p2.display();
        System.out.println("Products Created Successfully!");
    }
}
