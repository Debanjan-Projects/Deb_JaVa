package Dsa;

import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number Here : ");
        float number = input.nextFloat();
            
         if(number % 2 ==  0) {
            System.out.println("This number is a even number: " + number);
        } else if (number %2 != 0) {
            System.out.println("This number is a odd number: " + number);
        } 

        input.close();
    }
    
}
