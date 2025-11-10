package Challenge_Practics;

import java.util.Scanner;

public class leapYear { 
    public static void main(String[] args) {
        System.out.println("Determine a year leap year or not:");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year :");

    int year;

    if (input.hasNextInt()) {
    year = input.nextInt(); // just assign
    } else {
    System.out.println("It's not a year: Please enter a valid year.");
    return;
}

   
    if(year % 4 == 0){
        System.out.println("This is a leap year :"  + year);

    }

    else if(year % 400 == 0){
        System.out.println("Thsis is a leap year : " + year);
    }

    else  {
        System.out.println("This is not a leap lear :" +  year);
    }

    }
    
}
