import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first value number: ");
        int firstNumber = input.nextInt();

        System.out.print("Now please enter your second value number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Here is your result: " + sum);

        input.close(); // good practice to close the scanner
    }
}

