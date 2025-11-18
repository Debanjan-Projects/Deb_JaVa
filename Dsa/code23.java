package Dsa;

import java.util.Scanner;

public class code23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int num = input.nextInt();

       
        int sum = 0;

        while(num>0){
          int  digit = num %10 ;
            sum = sum + digit;
            num = num/10;

        }

        System.out.println("The Sum of the all odd number is : " + sum );
        input.close();
    }
    
}
