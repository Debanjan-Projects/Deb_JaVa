package Dsa;

import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number Here : ");
        float number = input.nextFloat();

        if (number > 0) {
            System.out.println("This number is a Positive number: " + number);
        } else if (number < 0) {
            System.out.println("This number is a Negative number: " + number);
        } else {
            System.out.println("The number is Zero.");
        }

        input.close();
    }
}
