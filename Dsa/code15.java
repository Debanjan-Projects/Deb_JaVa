package Dsa;

import java.util.Scanner;

public class code15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Year Here : ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        input.close();
    }
}
