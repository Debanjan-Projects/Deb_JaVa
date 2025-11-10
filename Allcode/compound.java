import java.util.Scanner;

public class compound{
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("calculate the scompound interest");
        System.out.println("Enter the p of the amount :");

        int principle = input.nextInt();
        System.out.println("Enter the time of the amount :");

        int time = input.nextInt();

        System.out.println("enter the interest of the amount :");
        int interest = input.nextInt();


        int calculate = principle*(1+interest/100)*time;

        System.out.println("total calculated interest in the hole year is :" + calculate);
    }
    
}

