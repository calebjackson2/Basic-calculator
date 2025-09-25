package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = myScanner.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = myScanner.nextInt();

        float result = firstNumber * secondNumber;
        System.out.println("The result is: " + result);
    }
}
