package Challenge_Practics;

import java.util.Scanner;

public class p_floatingN {


    public static void main(String[] args) {
        System.out.println("Welcome to folating calculator:");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first floating  number :");

        double var = input.nextDouble();

        System.out.println("Enter the second float number :");
        double var1 = input.nextDouble();

        double cacl = var * var1;
        System.out.println("Here is your result :" + cacl);

    }
    
}
