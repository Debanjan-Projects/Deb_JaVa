package variableDataTypesInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner   input = new Scanner(System.in);
        //object intialization.

        //cllass hain ak reference banaya hainn  =right meuin hainn object .(jho bhi default input hain oha se hi export karna hain.)

        System.out.println("Please Enter your name :");

       String name =  input.nextLine();

       System.out.println("Good morning " + name);

        System.out.println(name+ ", Also tell me your age " );

        int age = input.nextInt();
        System.out.println("your age is : " + age);
    }
}
