public class Car{

    static int noOfCarSold;
    int noOfWheels;

    String Colour;

    float maxSpeed; 

    float CurrentFuleInLiters;


    int noOfseats;

    // crate a static block ..
    // static block srif ak bar hi call hota hain , puro code jab tak run kare , 

    // jab class load hota hain , tab bhi static block call hota hain..

    static{
        noOfCarSold = 0;
        System.out.println("I am in static Blocks :");
    }

    //normal block ..
    //ehh block har obj ke create hone per call hota hain .

    {
        noOfCarSold++;
        System.out.println("I am in init Block");
    }

    //declare a constructor..
    //by default jab bhi koi obj banega ...


    //colour ko argument mein lehh liya hain ..

    Car(String Colour){
       this.Colour = Colour;
       noOfWheels = 4;
       maxSpeed = 150;
       CurrentFuleInLiters = 5l;
       noOfseats = 6;

    }

    // Car(){
    //    Colour = "Red";
    //    noOfWheels = 4;
    //    maxSpeed = 150;
    //    CurrentFuleInLiters = 5l;
    //    noOfseats = 6;

    // }

    Car(){
        // ehh all time msut be a first statement ...
        this("Red");
    }


    // this all are instance variable ,
    //instance property.


    //create a instance method..

    public Car Start(){

         if(CurrentFuleInLiters == 0){
            System.out.println("Car is out of fuel- car can not start right now -");
        }else{
             System.out.println("Car is started -- bruhhhhhhhhhhhhh");
            
        }
        return this;
       

    }

    public void drive(){

        CurrentFuleInLiters--;
        if(CurrentFuleInLiters < 5){
            System.out.println("Car is in Reserved Mode : pLease Refuel");
        }else{
              System.out.println("Car is Driving ");
        }
       
           
        
    }


    public void addFuel(float  CurrentFuleInLiters){
        //current obj ka ..
        // apne class ka koi bhi property use karna hooin , instance  variable use karna hoin , instance method use karna hoin , too udhar hhum log this use kar sakte hain ..


        this.CurrentFuleInLiters +=  CurrentFuleInLiters;

    }

    public float getCurrentFuelLevel(){
       return CurrentFuleInLiters; 
    }




    public static void main(String[] args) {

    //     //object creation..
       Car myCar = new Car("Black");
       myCar.Start().drive();
       System.out.println(myCar.Colour);
       System.out.println(myCar.noOfWheels);
       System.out.println(myCar.noOfseats);
       System.out.println(myCar.CurrentFuleInLiters);
    //    myCar.addFuel(6);
    //    Car startedCar =  myCar.Start();
    //    System.out.println(myCar.getCurrentFuelLevel());
    //    startedCar.drive();
    //    myCar.drive();
    //    myCar.drive();

      
       //hum log method pass to pass likh sakte hain ..

       
      
       

    }
}