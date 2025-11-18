package Dsa;

import java.util.Scanner;

public class code28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int num = input.nextInt();
        System.out.println("The searies is ");
        printFibonacci(num);
    
    }
    
    public static void printFibonacci(int num){
        if(num< 0){
            return;
        }
        System.out.println("0"); 
        if(num ==0){
            return ;
           
        }
        int first = 0;
        int second = 1;

        while(first + second <= num){
            int third = first + second;
            System.out.println(
                third + " "
            );
           first = second ;
           second  = third; 

        }
    }
    
}
