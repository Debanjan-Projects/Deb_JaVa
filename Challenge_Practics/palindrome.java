package Challenge_Practics;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker : \n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your number here");

        int num = input.nextInt();

        boolean ispalindrome = ispalindrome(num);
        if(ispalindrome){
            System.out.println("your number is palindrome number : \n" );
        }
        else {
            System.out.println(
                "your number is not a palindrome number : \n"
            );
        }


    }


    public static boolean ispalindrome(int num ){

        int reverse = reverse(num);

        return  num == reverse;


       

    }


    public static int reverse(int num){
        int newNum = 0;
        while(num> 0 ){
            int digit  = num %10;
            newNum = newNum *10 +digit;
            num /= 10;
        }
           return newNum ;
    }
 
    
}
