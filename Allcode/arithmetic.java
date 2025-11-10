import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {

        
       Scanner input = new Scanner (System.in);
       System.out.println("Lets do some arthmetic operations");

       System.out.println("Enter your First number :");
       int a = input.nextInt();

       System.out.println("Enter your second number :");
       int b = input.nextInt();

       int add = a +b;
       int sub = a-b;
       int mul = a*b;
       int div = a/b;
       int mod = a%b;
       System.out.println("The results is  :" + add);
       System.out.println("The results is  :" + sub);
       System.out.println("The results is  :" + mul);
       System.out.println("The results is  :" + div);
       System.out.println("The results is  :" + mod);
       

    }
    
}
