package Dsa;

import java.util.Scanner;

public class code4 { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter the first number here :");
    int num1 = input.nextInt();
    System.out.println("Please Enter the second Number here :" );
    int num2 = input.nextInt();
    int num3 ;


    num3 = num1;
    num1 = num2;
    num2 = num3;

    System.out.println(" the number are present are : " + "num1:- " +num1 + " " +  "num2:- " + num2) ;

   
    

}
    
}
