import java.util.Scanner;

public class p_floatN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lest do the product of two floating number");

        System.out.println("Enter your first float number :");
        double a = input.nextDouble();

        System.out.println(
            "Enter your second float number :"
        );

        double b = input.nextDouble();

        double product = a*b;

        System.out.println("The product result is " +   product);

    }
    
}
