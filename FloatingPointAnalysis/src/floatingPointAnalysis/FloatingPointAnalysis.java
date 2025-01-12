package floatingPointAnalysis;

import java.util.Scanner;

public class FloatingPointAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double total = 0;
        double maximum = Double.MIN_VALUE; // Smallest possible value for comparison
        double minimum = Double.MAX_VALUE; // Largest possible value for comparison

        System.out.println("Enter 5 floating-point numbers:");

        // Use a for loop to gather 5 inputs
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            while (!scanner.hasNextDouble()) { // Input validation
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // Clear invalid input
            }
            double number = scanner.nextDouble();
            total += number;

            // Update maximum and minimum
            if (number > maximum) {
                maximum = number;
            }
            if (number < minimum) {
                minimum = number;
            }
        }

        // Calculations
        double average = total / 5;
        double interest = total * 0.2;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close(); // Close the scanner
    }
}
