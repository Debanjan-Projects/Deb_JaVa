package Challenge_Practics;

import java.util.Scanner;

public class sumOfOddNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to addition world \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number here :");

        int number = input.nextInt();
        int sum = oddsum(number);
        System.out.println("oddsum till  "  + number + "is " +  sum);


        

    }
    

    public static int oddsum ( int number ){
        int sum = 0;
        int i = 1;
        while (i <= number){
            sum = sum +i;
            i = i+2;
           
            
          
            System.out.println(i);
        }
        return sum;


    }
}



