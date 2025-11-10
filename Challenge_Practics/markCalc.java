package Challenge_Practics;

import java.util.Scanner;

public class markCalc {
    public static void main(String[] args) {
        System.out.println("calculate the grade of a student:");


        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if(number > 100 || number < 0){
            System.out.println("Enter the valid number here :Grade is Unpredictable:");
            
        }
        else if (number >= 90 && number < 100){
            System.out.println("The student number grade is :A" + number);
        }
        else if (number >= 75 &&number <= 90){
            System.out.println("The student number grade is :B" + number);
        }
        else if (number >= 60 &&  number <= 75){
            System.out.println("The student number grade is :C" + number);
        }
        else if (number >= 30 && number <= 60){
            System.out.println("The student number grade is :D" + number);
        }
        else{
            System.out.println("The student nnumber grade is :F" + number);
        }
    }
    
}
