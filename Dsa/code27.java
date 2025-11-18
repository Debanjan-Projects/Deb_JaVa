package Dsa;

import java.util.Scanner;

public class code27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int num = input.nextInt();

       
        int sum = 0;
        int newnum =0;
        while(num>0){
          int  digit = num %10 ;
            newnum = newnum * 10  + digit;
            num = num/10;

        }

        System.out.println("The Sum of the all odd number is : " + newnum );
        input.close();
    }
    
    
}
