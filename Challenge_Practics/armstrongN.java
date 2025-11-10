package Challenge_Practics;

import java.util.Scanner;

public class armstrongN {
    public static void main(String[] args) {
        
        System.out.println("Welcome to armstrong number checker : \n");
        Scanner input = new Scanner(System.in);
        System.out.println(
            "Enter your number here :\n"
        );
        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if(isArmstrong){
            System.out.println("Your number is armstrong :\n");
        }
        else{
            System.out.println("your number is not armstrong :\n");
        }


    }


    public static boolean isArmstrong(int num ){

        int noOfdigits = noOfDigit(num);
        int numCopy = num;
        System.out.println("no of digits : " + noOfdigits);
        int finalNumber = 0;
        while (num > 0){
            int lastdigit = num% 10 ;
            num /= 10;
            finalNumber += power(lastdigit , noOfdigits);



        }
       

        return finalNumber == numCopy;
    }


    public static int power(int num1 , int num2){
       int  result = num1;
       int  i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
       
       return result;

    }


    public static int noOfDigit(int num){
        int digits = 0;
        while ( num> 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
    
}
