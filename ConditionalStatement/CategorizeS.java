package ConditionalStatement;

import java.util.Scanner;

public class CategorizeS {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Student Categorized checker");
        System.out.println("Please Enter students Mark  here : ");
        int marks = input.nextInt();

        String category = (marks> 100)? "invalid Marks Report ":(marks<0)? "invalid marks input" : (marks > 80) ? "High " : (marks> 50 && marks<80) ?  "Moderate" :  "Low" ;
        System.out.println("Your category is:"  + category);
        
    }
    
}
