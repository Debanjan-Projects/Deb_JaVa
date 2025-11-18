package Dsa;

import java.util.Scanner;

public class code25 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int first = input.nextInt();
        System.out.println("Please Enter a number here :" );
        int second = input.nextInt();

        int Gcd = Gcd(first, second );
        System.out.println("Gcd of the two numbers is : " + Gcd);

    }

    public static int Gcd(int first , int second){
        int gcd = 1;
        int limit = least(first, second);

        for(int i = 1; i <= limit; i++){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }


   public static int least(int num1, int num2){
    if(num1> num2){
        return num1;
    }else{
        return num2;
    }
   }
    
}

    


    

