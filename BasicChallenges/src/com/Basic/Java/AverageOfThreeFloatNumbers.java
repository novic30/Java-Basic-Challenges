package com.Basic.Java;

import java.util.Scanner;

public class AverageOfThreeFloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        float firstNumber = 0.0f;
        float secondNumber = 0.0f;
        float thirdNumber = 0.0f;
        boolean isValidInput = true;

        while (isValidInput) {
            try {
                System.out.print("\nPlease enter the first number (only give float value in x.x format): ");
                firstNumber = Float.parseFloat(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid float value for the first number!\n");
            }
        }

        isValidInput = true; 

        while (isValidInput) {
            try {
                System.out.print("\nPlease enter the second number (only give float value in x.x format): ");
                secondNumber = Float.parseFloat(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid float value for the second number!\n");
            }
        }

        isValidInput = true;

        while (isValidInput) {
            try {
                System.out.print("\nPlease enter the third number (only give float value in x.x format): ");
                thirdNumber = Float.parseFloat(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid float value for the third number!\n");
            }
        }

        float sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("\nAverage of the float numbers is: " + sum / 3);
        scanner.close();
    }
}
