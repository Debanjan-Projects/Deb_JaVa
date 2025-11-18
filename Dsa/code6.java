package Dsa;

import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println(" Please Enter the first number here: ");

        float num1 = input.nextFloat();
        System.out.println(
            "Please enter the second number here :"
        );
        float num2 = input.nextFloat();

        float num3 = num1 *  num2;

        System.out.println("The multiplication in between two folating number is : " + num3);
    }
    
}
