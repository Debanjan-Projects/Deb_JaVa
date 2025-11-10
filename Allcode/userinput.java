import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//object declaration.
        System.out.println("please Enter Your name ") ;
        String name =input.nextLine();
        System.out.println("good Morning"   + " " + name);
        System.out.println(name + "Also Tell Me Your Age");

        int age = input.nextInt();//here always return a int value //another type of values are make here an error.
        System.out.println("Your age is :" + age);

    }
}









//abhi tak hum log main meythod ke andar system.out.print kar rahe the its means method mein currently jho hain ushe prinnt kar do.

//input lene hain.
//lekin ab hum log system in karenge.
//Scanner..immediately import kar lega ..


//jhoo classes pahele she likha huya mila hain ,un mein she agar kishu ko bhi used karna hain to hum log ,import se ohh used kar sakta hain.

//import java.util.Scanner;

//esob already jre ke pass hota hain .

//jre jvm ko ishh inforrmaition de deta hain..
