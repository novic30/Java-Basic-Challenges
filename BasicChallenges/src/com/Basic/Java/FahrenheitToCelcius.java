package com.Basic.Java;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        boolean isValidInput = true;

        while (isValidInput) {
            try {
                System.out.print("Temperature in Fahrenheit (onhly give integer value): ");
                fahrenheit = Integer.parseInt(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid integer value!\n");
            }
        }
        isValidInput = true;

        double celsiusValue = (fahrenheit - 32) * (5.0 / 9.0);
        double roundedCelsiusValue = Math.round(celsiusValue * 100) / 100.0;

        System.out.println("Temperature in Celsius: " + roundedCelsiusValue);

        scanner.close();
    }
}