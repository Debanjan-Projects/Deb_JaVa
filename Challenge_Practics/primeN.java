package Challenge_Practics;

import java.util.Scanner;

public class primeN {
    public static void main(String[] args) {
        System.out.println("HERE is your prime  number checker :\n");

        Scanner input = new Scanner (System.in);

        System.out.println("Enter Your Number : \n");
        int num1= input.nextInt();
        boolean prime = isprime(num1);
       if(prime){
        System.out.println("Your number is prime : ");

       }
       else{
        System.out.println("Your number is not prime ");
       }


    }


    public static boolean isprime(int num1){
        int i = 2;
        while ( i <= num1){
            if(num1 % i == 0){
               return false;
           

        }
         i++;
        
    }
    return true;
    
  }

}
