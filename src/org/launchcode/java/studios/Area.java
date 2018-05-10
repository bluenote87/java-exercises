package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Area program = new Area();
        program.findArea();
    }

    private static void findArea() {

        Scanner sc = new Scanner(System.in);
        boolean isNegative = true;
        double input;
        while (isNegative) {
            System.out.println("Enter a new radius:");
            input=sc.nextFloat();
            if (input <= 0) {
                System.out.println("I need a positive value greater than zero. Try again.");
            } else {
                isNegative=false;
                double area = Math.PI * (input * input);
                System.out.println("The area of a circle with " + input + " radius is: " + area);
            }
        }

    }
}
