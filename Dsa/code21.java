package Dsa;

import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int num = input.nextInt();

        int i = 1;
        int sum = 0;

        while(i <= num){
            if(i % 2 != 0){   // condition for odd number
                sum = sum + i;
            }
            i++;  // increase i to avoid infinite loop
        }

        System.out.println("The Sum of the all odd number is : " + sum );
        input.close();
    }
}
