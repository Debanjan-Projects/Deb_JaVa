package Challenge_Practics;

import java.util.Scanner;

public class diff_person {
    public static void main(String[] args) {
        System.out.println("Enter the age :For Determine");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        System.out.println("Enter the age :")  ;

        if(age >=100){
            System.out.println("The person is not alive now");
        }
        else if(age <1){
            System.out.println("He/she not bron right now");
        }
        
        else if(age >= 60){
            System.out.println("Those persons are senior now:" + age);
        }
        else if(age < 60 && age >= 20){
            System.out.println("Those persons are Adult now:" + age);
        }
        else if(age < 20 && age>= 13){
            System.out.println("Those persons are teen now:" + age);
        }
        else {
            System.out.println("Those persons are child now:" + age);
        }

    }
    
}
