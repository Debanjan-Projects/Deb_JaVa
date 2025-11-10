import java.util.Scanner;

public class simpleI {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("calculate the simple interest");
        System.out.println("Enter the p of the amount :");

        int principle = input.nextInt();
        System.out.println("Enter the time of the amount :");

        int time = input.nextInt();

        System.out.println("enter the interest of the amount :");
        int interest = input.nextInt();


        int calculate = (principle*time*interest)/100;

        System.out.println("total calculated interest in the hole year is :" + calculate);
    }
    
}
