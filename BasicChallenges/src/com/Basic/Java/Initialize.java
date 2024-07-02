package com.Basic.Java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Initialize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double decimalNumber = 0;
        int integerNumber = 0;
        boolean isValidInput = true;

        // Input for decimal number
        while (isValidInput) {
            try {
                System.out.print("Please give the decimal number: ");
                decimalNumber = scanner.nextDouble();
                System.out.println("Your decimal value is: " + decimalNumber);
                isValidInput = false;
            } catch (InputMismatchException ime) {
                System.out.println("\nPlease enter a valid decimal value!\n");
                scanner.next(); // Clear the invalid input
            }
        }

        isValidInput = true;

        while (isValidInput) {
            try {
                System.out.print("Please give the integer number: ");
                integerNumber = scanner.nextInt();
                System.out.println("Your integer value is: " + integerNumber);
                isValidInput = false;
            } catch (InputMismatchException ime) {
                System.out.println("\nPlease enter a valid integer value!\n");
                scanner.next();
            }
        }

        scanner.close();
    }
}