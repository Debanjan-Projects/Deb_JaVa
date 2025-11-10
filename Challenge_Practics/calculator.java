package Challenge_Practics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to our normal calculator:");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number here :");
        int first = input.nextInt();
        System.out.println("Enter the second nuber :");
        int second = input.nextInt();

        int add = first + second;
        

         int sub = first - second;

        int mul= first *second;

         int div = first / second;

         int rem= first % second;

         System.out.println("Here is out calculator :" + add);
         System.out.println("Here is out calculator :" + sub);
         System.out.println("Here is out calculator :" + mul);
         System.out.println("Here is out calculator :" + div);
         System.out.println("Here is out calculator :" + rem);
       
    }
    
}
