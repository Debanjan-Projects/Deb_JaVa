package Challenge_Practics;

import java.util.Scanner;

public class LCM {
     public static void main(String[] args) {
    System.out.println("Here is your  LCM : \n");
      Scanner input =  new Scanner(System.in);
      System.out.println(" Please Enter your number : \n");

      int first = input.nextInt();

      System.out.println("Please Enter your number :\n"  );

      int second = input.nextInt();

      int lcm = lcm(first, second);

      System.out.println("LCm of the twonumber is :" + lcm);

}


public static int lcm( int first ,  int second){
    int i = 1;
    while(true ){

        int fact = first * i;
        if(fact % second == 0){

            return fact;

        }
        i++;
    }


    // return 0; //unreachable.
}
    
}

//dono she divide hota hain .lCM sabshe chota .
