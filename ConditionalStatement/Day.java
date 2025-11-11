package ConditionalStatement;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
            " Welcome to week Representer.in"
        );
     
     System.out.println("Enter your input here : ");
     int day = input.nextInt();

     switch (day) {
        case 1:System.out.println("Monday");
            
            break;
        case 2:System.out.println("TuesDay");
            
            break;
        case 3:System.out.println("Wednesday");
            
            break;
        case 4:System.out.println("ThursDay");
            
            break;
        case 5:System.out.println("Friday");
            
            break;
        case 6:System.out.println("SaturDay");
            
            break;
        case 7:System.out.println("SunDay");
            
            break;

     
        default:System.out.println("Please Enter a Valid Input Here :");
        break;
           
     }
    }
    
}
