package Dsa;

import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Principal Amount : ");
        float P = input.nextFloat();

        System.out.println("Please enter the Time (in years): ");
        float T = input.nextFloat();

        System.out.println("Please enter the Rate of interest (%): ");
        float R = input.nextFloat();

        double amount = P * Math.pow((1 + R / 100), T);
        double compoundI = amount - P;

        System.out.println("The Compound Interest is : " + compoundI);
        System.out.println("Total Amount after Compound Interest is : " + amount);

        input.close();
    }
}
