package Challenge_Practics;

import java.util.Scanner;

public class GraterOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers to find the greatest:");

        double a, b, c;

        // Input for first number
        System.out.print("Enter the first number: ");
        if (input.hasNextDouble()) {
            a = input.nextDouble();
        } else {
            System.out.println("Invalid input! Not a number.");
            return;
        }

        // Input for second number
        System.out.print("Enter the second number: ");
        if (input.hasNextDouble()) {
            b = input.nextDouble();
        } else {
            System.out.println("Invalid input! Not a number.");
            return;
        }

        // Input for third number
        System.out.print("Enter the third number: ");
        if (input.hasNextDouble()) {
            c = input.nextDouble();
        } else {
            System.out.println("Invalid input! Not a number.");
            return;
        }

        // Comparison logic
        if (a > b && a > c) {
            System.out.println("The first number is the greatest: " + a);
        } else if (b > a && b > c) {
            System.out.println("The second number is the greatest: " + b);
        } else if (c > a && c > b) {
            System.out.println("The third number is the greatest: " + c);
        } else {
            System.out.println("No single number is the greatest — maybe they are equal or two numbers are same and largest.");
        }

        input.close();
    }
}
