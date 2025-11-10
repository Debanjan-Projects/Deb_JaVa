package Challenge_Practics;

import java.util.Scanner;

public class C_fahrenheitToC {
    public static void main(String[] args) {
        
        System.out.println("Convert Fahrenheit to celsius :");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the fahrenheit tempareture in F:");

        float fah = input.nextFloat();

        float cel = (fah-32) * 5/9;
        System.out.println("Here is your tempareture is :" + cel +"C" );
    }

    //all calculation are solved usng bodmas rule.
    
}
