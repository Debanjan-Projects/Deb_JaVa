package Challenge_Practics;

import java.util.Scanner;

public class factorialOfN {
    public static void main(String[] args) {
        
        System.out.println("Welcome in the factorial number world \n");
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter your number here :");
        int num = input.nextInt();

        long  fact = numfactor(num);
        System.out.println("The factorial number is :"+ fact);
        
    }




    public static long numfactor (int num){

        if(num < 2){
            return 1;
        }


        long fact = 1;

        int i = 2;
        while(i <= num){

            fact = fact*i;
            i++;

            System.out.println(i);
        }
        return fact;



    }
    
}
