package com.Basic.Java;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;
        boolean isValidInput = true;  
        
        while (isValidInput) {
            try {
            	System.out.print("Please give the first number(only give integer value): ");
            	firstValue = Integer.parseInt(scanner.nextLine().trim());
                isValidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("\nPlease enter a valid integer value!\n");
            }
        }
        
        isValidInput = true;
        
        while (isValidInput) {
            try {
                System.out.print("\nPlease give the second number(only give integer value): ");
              	secondValue = Integer.parseInt(scanner.nextLine().trim());
                isValidInput = false;
                } catch (NumberFormatException e) {
                    System.out.println("\nPlease enter a valid integer value!\n");
                }
            }

		System.out.println("\n1." + firstValue);
		System.out.println("2." + secondValue);
		System.out.println(" ");

		firstValue = firstValue + secondValue;
		secondValue = firstValue - secondValue;
		firstValue = firstValue - secondValue;
		System.out.println("1." + firstValue);
		System.out.println("2." + secondValue);
	}
}