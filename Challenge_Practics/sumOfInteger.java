package Challenge_Practics;

import java.util.Scanner;

public class sumOfInteger {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of digit number : ");
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter your number here :");
        int num  = input.nextInt();

        int sum = sumofdigit(num);
        System.out.println("sum of digit " + sum
         );

    }
    

    public static int sumofdigit(int num ){

        int sum = 0;
        
        while(num>0){
            sum = sum + num  % 10;
            num = num / 10;

        }


        return sum;
    }
}
