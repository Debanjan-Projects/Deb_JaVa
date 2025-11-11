package ConditionalStatement;

import java.util.Scanner;

public class MinOFTwoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker :");
        System.out.println("Please Enter The first Number :");

        int num1 = input.nextInt();

        System.out.println("Please Enter The Second Number :");

        int num2 = input.nextInt();

        // if(num1> num2){
        //     System.out.println("Num2 is the mInimunm number here : " + num2);
        // }else {
        //     System.out.println("Num1 minimum number here : " + num1);
        // }

        //using ternary ..

        int minNum = (num1> num2) ? num2 : num1 ;
        System.out.println(
            minNum + " IS the minimum number here :"
        );
    
    }
    
}
