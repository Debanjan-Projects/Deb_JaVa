package Dsa;

import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
         Scanner input = new Scanner( System.in);
        System.out.println(" Please Enter Base of the traingle : ");

        float Base= input.nextFloat();
        System.out.println(
            "Please enter the Height of the triangle :"
        );
        float Height = input.nextFloat();


        float Area = ((Base *Height)/2);

        System.out.println(
            "The Area of a triangle is : " + Area
        );
    }
    
}
