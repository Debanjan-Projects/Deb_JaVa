package Dsa;

import java.util.Scanner;

public class code26 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int first = input.nextInt();
       

       boolean isPrime = isPrime(first);
       if(isPrime){
        System.out.println("Your number is a prime number " +first  );
       }else{
        System.out.println("your number is not prime number " + first);
       }

    }

    public static boolean isPrime(int num){

        int i =2;
        while(i<num){
            if(num %  i ==0){
                return false;
            }
            i++;
        }
        
        return true;
    }

    
}
