package Challenge_Practics;

import java.util.Scanner;

public class bitwise_odd_even {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to odd/even calculator:");
        System.out.println("please Enter your number:");
         int num = input.nextInt();

         if((num & 1) == 1){
            System.out.println("your number is odd");
         }else{
            System.out.println("your number is even");
         }
    }
    
}
