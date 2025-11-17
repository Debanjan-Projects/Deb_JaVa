package Loops;

import Challenge_Practics.ArrayUtility; // ✅ Add this line

public class UsingOfContinue {
    public static void main(String[] args) {
        System.out.println("Welcome to adding all positive numbers together!");

        // Get the array input from ArrayUtility class
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue; // skip negative numbers
            }
            sum += num;
        }

        System.out.println("The sum of all positive numbers is: " + sum);
    }
}
