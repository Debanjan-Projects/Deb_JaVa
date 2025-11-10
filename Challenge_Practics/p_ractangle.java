package Challenge_Practics;

import java.util.Scanner;

public class p_ractangle {

    public static void main(String[] args) {
        
        System.out.println("parameter of a Ractangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side value the ractangle");
        double side1 = input.nextDouble();
        System.out.println("Enter the second side value of the ractangle: ");
        double side2 = input.nextDouble();

        System.out.println("Enter the third side value of the ractangle :");

       double side3 = input.nextDouble();

        System.out.println("Enter the fouth side value of the ractangle:");
      double side4 = input.nextDouble();

        double total = side1 + side2 + side3 + side4;

        System.out.println("The total parameter of the ractangle is :" + total);
    }

    //we can used here double also ...
    
}
