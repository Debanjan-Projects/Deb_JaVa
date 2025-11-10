package Challenge_Practics;

import java.util.Scanner;

public class multiplicationT {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication World\n");
        System.out.println("Please Enter your number : ");

        int num = input.nextInt();
        printmultilicationTable(num);
        
    }


    public static void printmultilicationTable(int num) {
        int i = 1;
        while (i<=10){
            System.out.println(num +" X " + i + " = " + (num * i ));
            i++;
        }


        
    }
    
}
