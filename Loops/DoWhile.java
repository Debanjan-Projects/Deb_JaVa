package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome the age checker");
        // System.out.println("Please Enter your age  here : ");
        // int age = input.nextInt();

        // while(age < 0  || age> 100){
        //      System.out.println("Please Enter your age  here : ");
        //      age = input.nextInt(); 
        // }

        int age ;
        do {
             System.out.println("Please Enter your age  here : ");
             age = input.nextInt(); 
        } while (age> 100 || age<0);
        System.out.println("Your age is " + age + "year");
        
    }
    
}
