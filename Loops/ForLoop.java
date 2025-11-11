package Loops;

import java.util.Scanner;

public class ForLoop {public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Welcome the number printer . Machine ");
        System.out.println("Please Enter  your number here : ");
        int number = input.nextInt();

        for(number = 0 ; number<= 100 ; number++){
            System.out.println("The Number is :" + number);
        }
        
}
    
}
