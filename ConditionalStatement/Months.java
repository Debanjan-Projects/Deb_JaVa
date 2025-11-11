package ConditionalStatement;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Months Shower:");
        System.out.println("Please Enter Your months number here : ");
        int months = input.nextInt();

        switch (months) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octaber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        
            default:System.out.println("Enter a valid months number of the year : this is a invalid input :");
                break;
        }
        
    }
    
}
