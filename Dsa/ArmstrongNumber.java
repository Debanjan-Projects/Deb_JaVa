package Dsa;

import java.util.Scanner;

public class ArmstrongNumber {

    c

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;             // extract last digit
            sum += Math.pow(digit, digits);   // add digit^digits
            num /= 10;                        // remove last digit
        }

        return sum == original;
    }
}
