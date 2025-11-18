package Dsa;

import java.util.Scanner;

public class code7 {public static void main(String[] args) {
     Scanner input = new Scanner( System.in);
        System.out.println(" Please Enter the value of the first side of a rectangle : ");

        float num1 = input.nextFloat();
        System.out.println(
            "Please enter the second side value of a ractangle :"
        );
        float num2 = input.nextFloat();

        System.out.println(
            "Please enter the third side value of a ractangle :"
        );
        float num3 = input.nextFloat();
        System.out.println(
            "Please enter the fourth side value of a ractangle :"
        );
        float num4 = input.nextFloat();

        float result = num1 + num2 + num3 + num4;
        System.out.println("The Result of the perimeter of a ractangle is ; " + result );

}
    
}
