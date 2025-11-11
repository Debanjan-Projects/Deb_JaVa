package ConditionalStatement;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to this calculator!");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("Please enter the operation you want to perform (+, -, *, /): ");
        char operation = input.next().charAt(0);

        int result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("The addition result is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The subtraction result is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The multiplication result is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division result is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid operation entered!");
        }

        input.close();
    }
}
