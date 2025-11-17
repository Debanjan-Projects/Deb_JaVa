package Loops;

import java.util.Scanner;

public class BreakU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Saw a Break Statement ");

        while (true) {
            System.out.println("please Enter your command saimultaniiously .");
            // int num = input.nextInt();
            String comnd = input.next();

            if (comnd.equals("exit")) {
                break;
            }
        }

        System.out.println("you have successfully exited ");

    }

}
