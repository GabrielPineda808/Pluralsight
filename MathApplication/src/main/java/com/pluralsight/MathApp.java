package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 100000;
        int garySalary = 150000;
        int highestSalary = (int) Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 5000;
        int truckPrice = 10000;
        int lowestPrice = (int) Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice);

        float circleRadious = 7.25f;
        float circleArea = (float) (circleRadious*circleRadious*3.14);

        System.out.println("The area of the circle is " + circleArea);

        double square = 5.0;
        double root = Math.sqrt(square);

        System.out.println("The square root of " + square + " is " + root);

        float neg = -3.8f;
        float fin = Math.abs(neg);
        System.out.println("The absolute value of " + neg + " is " + fin);

        double rng = Math.random();
        System.out.println("Here is a random number enjoy! " + rng);
    }
}
