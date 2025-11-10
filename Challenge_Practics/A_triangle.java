package Challenge_Practics;

import java.util.Scanner;

public class A_triangle {
    public static void main(String[] args) {
        System.out.println("Area of a Triangle :");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base value of the triangle:");

        double base = input.nextDouble();

        System.out.println("Enter the height value of the triangle :" );

        double height = input.nextDouble();

        double Area = 0.5*(base + height);

        System.out.println("so the area of a triangle is :" + Area);
    }
    
}
