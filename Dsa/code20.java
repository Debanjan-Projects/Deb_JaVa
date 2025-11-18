package Dsa;

import java.util.Scanner;

public class code20 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter the number , which you want to create the multiplication table :");
    int num = input.nextInt();

    for( int i =1; i<=10; i++){
        int Mtable = num * i;
        System.out.println("The Multiplication table of this number is : " + num + " X" + i + " : " + Mtable );
    }
}
    
}
