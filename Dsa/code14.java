package Dsa;

import java.util.Scanner;

public class code14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter  the first Number Here : ");
        float number1 = input.nextFloat();

        System.out.println("Please Enter  the second Number Here : ");
        float number2 = input.nextFloat();

        System.out.println("Please Enter  the Third Number Here : ");
        float number3 = input.nextFloat();

        if (number1 > number2 && number1> number3) {
            System.out.println("Number1 is the greater number from this three numbers : " + number1);

        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number2 is the greater number from this three numbers : " + number2);
        } else {
            System.out.println("The number3 is the greatest number from this three number :" + number3);
        }

        input.close();
    }
    
}
