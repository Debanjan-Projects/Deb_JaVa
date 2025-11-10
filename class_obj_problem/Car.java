public class Car{
    int noOfWheels;

    String Colour;

    float maxSpeed;

    float CurrentFuleInLiters;


    int noOfseats;


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




    // public static void main(String[] args) {
    //     //object creation..
    //    Car myCar = new Car();
    //    myCar.addFuel(6);
    //    Car startedCar =  myCar.Start();
    //    System.out.println(myCar.getCurrentFuelLevel());
    //    startedCar.drive();
    //    myCar.drive();
    //    myCar.drive();

      
       //hum log method pass to pass likh sakte hain ..

       
      
       

    }
