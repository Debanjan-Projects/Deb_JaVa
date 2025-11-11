package Loops;

import java.util.Scanner;

public class passwordC {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome the password  checker");
       
       String password;

        do{
             System.out.println("Please Enter your password here : ");
            password = input.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks For entering a valid password ;");
        
    }

    public static boolean isValidPassword(String password){

        return password.length()> 6;
    }
    
}
