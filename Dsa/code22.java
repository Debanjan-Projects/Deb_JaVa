package Dsa;

import java.util.Scanner;

public class code22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int num = input.nextInt();

        int i = 1;
        int fact = 1;

        while(i <= num){
            fact = fact*i;
            i++;  // increase i to avoid infinite loop
        }

        System.out.println("The factorial  of the  number is : " + fact );
        input.close();
    }
    
}
