package com.Basic.Java;
import java.util.Scanner;

public class InputToOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String userInput = scanner.nextLine();
        
        System.out.println("Output: " + userInput);
        scanner.close();
    }
}
