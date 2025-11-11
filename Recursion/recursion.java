package Recursion;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome recursion world : Create a factorial generator :");
        System.out.println("Please Enter a number here : ");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println("factorial of your number is :" + fact);


        
    }

    //using recursion
    public static long factorial(int number){
        System.out.println("Function call for :" + number);
        if(number == 1){
            return 1;
        }
        return number* factorial(number-1);
    }


    // public static long factorialIterative (int number){
    //     long result = 1;
    //     for( int i= 1; i<=number ; i++){
    //         result = result*i;
    //     }
    //     return result;
    // }
    
}
