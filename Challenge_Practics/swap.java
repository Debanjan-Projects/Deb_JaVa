package Challenge_Practics;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number here :");

        int var1 = input.nextInt();
        System.out.println("Enter the second number here :");

        int var2 = input.nextInt();

        int var3 = var1;

       

        var1 = var2;
        var2 = var3;
         System.out.println("here the second number changed into first is :" + var1);

         System.out.println("here the first number replace in the second number is :" + var2);
        

    }
    
}
