package ConditionalStatement;

import java.util.Scanner;

public class AbsoluteN {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Absolute Number checker");
        System.out.println("Please Enter a number here : ");
        int number = input.nextInt();
        
        int result = number >= 0 ?  number : -number ;
        System.out.println("Absolute value is : " + result );

    }
    
}
