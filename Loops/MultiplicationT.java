package Loops;

import java.util.Scanner;

public class MultiplicationT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Welcome to Printing Table");
        System.out.println("please Ehetr the Number , you want to print table off:");
        int num = input.nextInt();

        for(int i = 1; i<= 10; i++){
            System.out.println(num + " X" + i + " = " + (num*i));
        }
    }
    
}
