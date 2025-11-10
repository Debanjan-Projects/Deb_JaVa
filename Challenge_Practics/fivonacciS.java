package Challenge_Practics;

import java.util.Scanner;

public class fivonacciS {
public static void main(String[] args) {
    System.out.println("Here is your fibonacci series :\n");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter you number here : \n");
    int num = input.nextInt();

    System.out.println("Here si the febonacci series: \n" );

fseries(num);

}  


public static void fseries(int num ){

    if(num < 0){
        return;
    }
    System.out.println("0 ");
    if( num == 0){
        return;
       
    }
     System.out.println("1 ");

    int first = 0 , second = 1;

    while(first + second <=  num){
        int third = first + second ;
        System.out.println(
        third + " "
        );
        first = second ;
        second = third;
        
    }


     

}








}
