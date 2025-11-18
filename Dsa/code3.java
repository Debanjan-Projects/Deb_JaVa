package Dsa;

import java.util.Scanner;

public class code3 {public static void main(String[] args) {
    
     System.out.println("Welcome To Our Calculator :");
    Scanner input = new Scanner(System.in);
     System.out.println("Please Enter The Firts Number :" );
     int num1 = input.nextInt();
    System.out.println("Please Enter the second Number:");
    int num2 = input.nextInt();

    int result = num1+ num2;

    System.out.println("The sum of this two of "+  num1 + " + " + num2 + " "  + "is" + " " + result );

}
    
}
