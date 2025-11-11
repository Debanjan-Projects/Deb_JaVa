package Loops;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("🎯 Welcome to the Number Guessing Game!");

        int num = 5; // target number
        int guess;

        do {
            System.out.print("Please guess a number between 0 and 10: ");
            guess = input.nextInt();

            if (guess < num) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > num) {
                System.out.println("Too high! Try a smaller number.");
            } else {
                System.out.println("🎉 Well done! You guessed the number correctly!");
            }

        } while (guess != num); // continue until the user guesses right

        input.close();
    }
}
