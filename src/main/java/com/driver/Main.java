package com.driver;

public class Main {
    // I have created a class Product inside Main class
    static class Product {
        // Task 3: Method with two int paramete
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }
    //Creating the main method
    public static void main(String[] args) {
        // Task 2: Create object of Product
        Product p = new Product();

        // Call method with two int parameters
        int result1 = p.product(5, 10);
        System.out.println("Product of two integers: " + result1);

        // Call overloaded method with three int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Call overloaded method with two double parameters
        double result3 = p.product(2.5, 4.0);
        System.out.println("Product of two doubles: " + result3);
    }
}