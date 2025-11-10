package Challenge_Practics;
import java.util.Scanner;

public class ROfDigit {
  
    public static void main(String[] args) {
        System.out.println("Welcome to the reverse of digit  : ");
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter your number here :");
        int num  = input.nextInt();

        int reverse = reverse(num);
        System.out.println("reverse of digit is  " + reverse
         );

    }
    

    public static int reverse(int num ){

        int newNum  = 0;
        
        while(num > 0){
            int digit  =  num  % 10;
             newNum = newNum * 10 +  digit;
           num /= 10;

        }


        return newNum;
    }
}

    

