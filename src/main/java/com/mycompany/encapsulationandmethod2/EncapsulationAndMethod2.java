package com.mycompany.encapsulationandmethod2;

/**
 *
 * @author khaerullah
 */
public class EncapsulationAndMethod2 {

    // Class MethodExample berdiri sendiri
    public static class MethodExample {

        // Instance Method: Adds two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Instance Method: Prints a greeting message
        public void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }

        // Static Method: Calculates the area of a circle
        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
    }

    // Main method berada di class utama
    public static void main(String[] args) {
        // Membuat objek dari class MethodExample untuk memanggil instance methods
        MethodExample example = new MethodExample();

        // Memanggil instance method 'add'
        int sum = example.add(5, 7);
        System.out.println("Sum of 5 and 7: " + sum); // Output: Sum of 5 and 7: 12

        // Memanggil instance method 'greet'
        example.greet("Alice");  // Output: Hello, Alice!

        // Memanggil static method 'calculateArea'
        double area = MethodExample.calculateArea(5.0);
        System.out.println("Area of circle with radius 5.0: " + area);
    }
}
