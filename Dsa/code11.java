package Dsa;

import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter temperature in Fahrenheit: ");

        float F = input.nextFloat();
        
        float celsius = (F - 32) * (5f / 9f);

        System.out.println("The temperature in Celsius is: " + celsius);

        input.close();
    }
}
