package Dsa;

import java.util.Scanner;

public class code17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your age Here : ");
        int age = input.nextInt();

        if (age >= 110 ||age <= 0) {
            System.out.println("This age is not valid. Please enter correct age: " + age);
        } else if (age >= 60) {
            System.out.println("The person is  : Senior " + age);
        } else if (age <=59 && age>=20) {
            System.out.println("The person is  :  Adult" + age);
        } else if (age <= 20 && age>= 13) {
            System.out.println("The persons are ; Teen" + age);
        } else if (age <=12) {
            System.out.println("Those are : child"   + age);
        }
        input.close();
    }
}

    

