package Loops;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to break and continue checker");
        System.out.print("Please Enter your number here: ");
        int number = input.nextInt();

        for (int i = 0; i <= 100; i++) {
            if (i == 6) {
                continue;
               // skips 6
            } else if (i == 12) {
                break; // stops the loop completely
            }

            System.out.println("Current number: " + i);
        }

        System.out.println("Loop ended!");
    }
}
