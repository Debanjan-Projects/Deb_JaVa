package Challenge_Practics;

import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        System.out.println("Enter A number :For Check:");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number :");

        if(input.hasNextDouble()){
            double number = input.nextDouble();

            if(number % 2 == 0){
                System.out.println("This number is even Number :" + number);

            }
            else if(number % 2 != 0){
                System.out.println("This number is odd number:" + number);
            }
            else{
                System.out.println("Please enter a valid number :This is NAN:"+ number);
            }
        }
    }
    
}
