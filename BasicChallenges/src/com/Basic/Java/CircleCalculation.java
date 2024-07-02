package com.Basic.Java;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int radius = 0;
        boolean isValidInput = true;

        while (isValidInput) {
            try {
                System.out.print("\nPlease enter the radius of the circle: ");
                radius = Integer.parseInt(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid integer value for the radius!\n");
            }
        }

        double area = 22.0 / 7 * radius * radius; 
        double circumference = 22.0 / 7 * radius * 2;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
        scanner.close();
    }
}
