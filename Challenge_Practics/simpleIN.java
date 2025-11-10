package Challenge_Practics;

import java.util.Scanner;

public class simpleIN {
    public static void main(String[] args) {
        System.out.println("Result of a simple Interest:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount :");

        double principle = input.nextDouble();

        System.out.println("ENter the Time of the interest: ");

        double time = input.nextDouble();

        System.out.println("Enter the main interest of the amount :");

        double interest = input.nextDouble();

        double simpleInterest = (principle *  time * interest)/100;

        System.out.println("Here is the result of the simple interest : " + simpleInterest);
    }
    
}
