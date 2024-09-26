package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the first number: ");
        float num2 = scanner.nextFloat();

        scanner.nextLine();

        System.out.println(
                "Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");
        String operator = scanner.nextLine();

        scanner.close();

        switch (operator){
            case "A":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "S":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "M":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "D":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("That is not a proper choice. Try again.");
        }

    }
}
