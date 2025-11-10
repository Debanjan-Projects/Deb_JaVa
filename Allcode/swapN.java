import java.util.Scanner;

public class swapN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Lets do the swaping of two variable using third variable");  

      System.out.println("Enter the first number : ");
      int a = input.nextInt();
      System.out.println("Enter the second number value :");
        int b = input.nextInt();

     int c = a;
      a =b;
      b = c;

     System.out.println("value of a is: " + a);

     System.out.println("value of b is :" + b);


    }
    
    
    
}
