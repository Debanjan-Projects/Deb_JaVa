package Challenge_Practics;

import java.util.Scanner;

public class compoundIN {
    public static void main(String[] args) {
        System.out.println("Calculate the compound Interest :");

        Scanner input = new Scanner(System.in);

        System.out.println("Entre the principle amount of the interest ");

        double principle = input.nextDouble();

        System.out.println("Enter the Time of the interest:");

        double time = input.nextDouble();

        System.out.println("Enter the main interest of the total amount :");

        double interest = input.nextDouble();

        double compoundInterest = principle*((1+interest)/100)*time;

        System.out.println("Here the compoundInterest is : " + compoundInterest);


    }
    
}
