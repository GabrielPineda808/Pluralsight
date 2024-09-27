package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Basic Calculator app! ENJOY! :)");
        System.out.println("Enter the first number: ");
         double num1 = scanner.nextDouble();

        System.out.println("Enter the first number: ");
        double num2  = scanner.nextDouble();

        scanner.nextLine();

        calc(op(), num1,num2);

    }

    public static String op(){
        System.out.println(
                "Possible calculations:\n" +
                        "(A)dd\n" +
                        "(S)ubtract\n" +
                        "(M)ultiply\n" +
                        "(D)ivide\n" +
                        "Please select an option: ");

        return scanner.nextLine();
    }

    public static void calc(String operator, double x, double y){
        switch (operator){
            case "A":
                System.out.println(x+ " + " + y + " = " + (x + y));
                break;
            case "S":
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case "M":
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case "D":
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            default:
                System.out.println("That is not a proper choice. Try again.");
        }

    }

}
