package com.Basic.Java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Give your First Number (in format x.x): ");
            double number1 = 0;
            double number2 = 0;
            try {
                number1 = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("\nPlease enter a valid number!\n");
                continue;
            }

            System.out.print("\nGive your Second Number (in format x.x): ");
            try {
                number2 = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("\nPlease enter a valid number!\n");
                continue;
            }

            int choice = 0;
            try {
                System.out.println("\nWhat do you wish to do?\n");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.print("\nSelect 1, 2, 3 or 4: ");
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("\nPlease enter a CORRECT choice!\n");
                continue; 
            }

            switch (choice) {
                case 1:
                    performAddition(number1, number2);
                    break;
                case 2:
                    performSubtraction(number1, number2);
                    break;
                case 3:
                    performMultiplication(number1, number2);
                    break;
                case 4:
                    performDivision(number1, number2);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                    break;
            }

            continueCalculation = retry(scanner);
        }

        scanner.close(); 
    }

    public static void performAddition(double num1, double num2) {
        double result = num1 + num2;
        displayResult("Addition", result);
    }

    public static void performSubtraction(double num1, double num2) {
        double result = num1 - num2;
        displayResult("Subtraction", result);
    }

    public static void performMultiplication(double num1, double num2) {
        double result = num1 * num2;
        displayResult("Multiplication", result);
    }

    public static void performDivision(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            displayResult("Division", result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static boolean retry(Scanner scanner) {
        System.out.println("Would you like to try some other method? (1 for Yes, 2 for No)");
        int retryChoice = 0;
        try {
            retryChoice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException nfe) {
            System.out.println("\nPlease enter a valid number!\n");
            return true; 
        }
        return retryChoice == 1;
    }

    public static void displayResult(String operation, double result) {
        double roundedResult = Math.round(result * 100.0) / 100.0;
        System.out.println(operation + " of Given Numbers = " + roundedResult);
    }
}