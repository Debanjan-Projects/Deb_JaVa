import java.util.Scanner;

public class p_ractangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets calculate the parameter of a ractangle :");
        System.out.println("Enter the first side value of the Ractangele : ");

        int a = input.nextInt();
        System.out.println("Enter the value of second side of the ractangle :");
        int b = input.nextInt();

        System.out.println("Enter the value of third sid eof a ractangle :");

        int c = input.nextInt();

        System.out.println("Enter the value of forth side of the ractangle :");
        int d = input.nextInt();

        int sumOfEachSide = a+b+c+d;
        System.out.println(
            "The total sum of the all side of a ract angle is :" + sumOfEachSide
        );
    }
    
}
