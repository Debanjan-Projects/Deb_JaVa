package Dsa;

import java.util.Scanner;

public class code24 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number here :" );
        int first = input.nextInt();
        System.out.println("Please Enter a number here :" );
        int second = input.nextInt();

        int lcm = lcm(first, second );
        System.out.println("LCM of the two numbers is : " + lcm);

    }

   public static int lcm(int first , int second){
    int i = 1;
    while(i<= second){
        int factor = first* i;
        if(factor % second == 0  ){
            return factor;
        }
        i++;
    }
    return 0;
   } 
    
}

    

