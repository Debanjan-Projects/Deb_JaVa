public class Driver {

    static int minAgeForDriving = 18;


    String name;
    int age;
    String dateOfLicense;


    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriving;
    }


     public static void main(String[] args) {
        //object creation..
       Car myCar = new Car("Black");
       myCar.addFuel(6);
       Car startedCar =  myCar.Start();
       System.out.println(myCar.getCurrentFuelLevel());
       startedCar.drive();
       myCar.drive();
       myCar.drive();


       Driver myDriver = new Driver();
       myDriver.dateOfLicense = "1/jan/2025";
       System.out.println(Driver.minAgeForDriving);
    }

    // if in same same class there are two static variable , method , or kuch bhi ho , to dfir ohh kudh kudh ko access kar sakte hain ..

    //lekkin non static ke liye ehh nahi hoga , or nahi kar payeega ..


    //static  field ko  hum log static ke andar  bhi access kar paye , or nonstatic ke andar bhi use kar sake ..

    //lekin non static field , ko or non static method ko , static ke anndar access anhi kar sakte hain ..

   
    //static keyword ka matlabb ehh hain ki , aagar koi bhi varibale ko data ko method ko agar class ki anndar rakh na hian , to hum log static use kar sakte hain ..


    // object static class ko access kar sakte hian , lekin static class har ak obj ko access nahi kar sakte hain ..

    
}