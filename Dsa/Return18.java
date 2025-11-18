package Dsa;

import java.util.Scanner;

public class Return18 {
    public static void main(String[] args) {
        Greet();
        int num1 = readNumber();
        int num2 = readNumber();
       int sum = num1 + num2;

       System.out.println("The result is : " + sum );
    }




    public static int readNumber(){
        Scanner input = new Scanner(System.in);
      
      System.out.println("please Enter the  number :");
       int num1 = input.nextInt();
       return num1;

    }

    public static void Greet(){
        System.out.println("welcome too the calculator ");
    }
    
}
