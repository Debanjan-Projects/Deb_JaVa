import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calcute the are a of a triangle");

        System.out.println(
            "Enter the base of the triangle :"
        );

        double base = input.nextDouble();

        System.out.println("enter the height of the triangle :" );
        double height = input.nextDouble();

        double calculate = 0.5*base*height;

        System.out.println("The calculation is area of a triangle is :" + calculate);
    }
    
}
