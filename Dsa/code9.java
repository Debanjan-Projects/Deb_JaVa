package Dsa;

import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
         Scanner input = new Scanner( System.in);
        System.out.println(" Please Enter the Amount here : ");

        float P = input.nextFloat();
        System.out.println(
            "Please enter the Time here  :"
        );
        float T = input.nextFloat();
        System.out.println(
            "Please enter Rate of the value :  :"
        );
        float R = input.nextFloat();

        float simpleI = (P*T*R)/100;

        System.out.println(" The simple interest of a amount is : " + simpleI) ;

    }
    
}
