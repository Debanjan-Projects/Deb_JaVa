package Challenge_Practics;

import java.util.Scanner;

public class bitwiseNot {
    public static void main(String[] args) {
        
        System.out.println("Check the bitwise operation:");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Frist number :");

        int num1 = input.nextInt();
         

         int bitwise = ~num1;

         System.out.println("The convertion of bitwise opeartor not is:" + bitwise);

    }
    
}
