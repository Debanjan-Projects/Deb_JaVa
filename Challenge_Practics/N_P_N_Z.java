package Challenge_Practics;

import java.util.Scanner;

public class N_P_N_Z {
    public static void main(String[] args) {
        System.out.println("Here we check a number is positive : negative : zero:");
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the Number: ");

        if (input.hasNextDouble()) {
            double number = input.nextDouble();

            if (number == 0) {
                System.out.println("The number is Zero: " + number);
            } else if (number > 0) {
                System.out.println("The number is positive: " + number);
            } else {
                System.out.println("The number is negative: " + number);
            }
        } else {
            System.out.println("Please enter a valid number: This is not a number (NaN).");
        }

        input.close(); // optional but good practice
    }
}



// hasNextDouble() is a method of the Scanner class in Java.

//
// It checks whether the next input token is a valid double (decimal number) or not.