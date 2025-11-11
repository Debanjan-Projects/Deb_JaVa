package ConditionalStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the odd even checker");
        System.out.println("Please Enter a number here : ");
        int number = input.nextInt();

        

       System.out.println((number % 2 == 0) ? "Number is even" : "Number is Odd");

    }
    
}
