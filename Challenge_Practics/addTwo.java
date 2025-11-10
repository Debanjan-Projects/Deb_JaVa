package Challenge_Practics;

import java.util.Scanner;

public class addTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter the first number :");
        int  number1 = input.nextInt();

        System.out.println("please Enter your second number :");

        int number2 = input.nextInt();

        int sum = number1+number2;

        System.out.println("The result is : " + sum);

    }
    
}
