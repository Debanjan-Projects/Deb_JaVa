package Dsa;

import java.util.Scanner;

public class code16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Marks Here : ");
        int marks = input.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("This marks is not valid. Please enter correct marks: " + marks);
        } else if (marks >= 90) {
            System.out.println("The student grade is: A");
        } else if (marks >= 75) {
            System.out.println("The student grade is: B");
        } else if (marks >= 60) {
            System.out.println("The student grade is: C");
        } else if (marks >= 30) {
            System.out.println("The student grade is: D");
        } else {
            System.out.println("The student has failed. Marks: " + marks);
        }

        input.close();
    }
}
