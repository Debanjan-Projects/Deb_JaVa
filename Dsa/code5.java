package Dsa;

import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first Number here :");
        int num1 = input. nextInt();
        System.out.println("Please Enter The second number here :");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println(" The Results are : " + add + " " + " " +  sub  + " " + mul + " " + div + " " + mod  );
    }
    
}
