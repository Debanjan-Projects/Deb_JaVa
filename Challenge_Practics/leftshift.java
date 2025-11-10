package Challenge_Practics;

import java.util.Scanner;

public class leftshift {
     public static void main(String[] args) {
        
        System.out.println("Check the bitwise operation:");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Frist number :");

        int num1 = input.nextInt();
         

         int bitwise = num1 << 4;

         System.out.println("The convertion of bitwise opeartor left shift is:" + bitwise);

    }
    
}
