public class Car{
    int noOfWheels;

    String Colour;

    float maxSpeed;

    float CurrentFuleInLiters;


    int noOfseats;


    // this all are instance variable ,
    //instance property.


    //create a instance method..

    public void drive(){

        if(CurrentFuleInLiters == 0){
            System.out.println("Car is out of fuel-");
        }else if(CurrentFuleInLiters<5){
            System.out.println("Car is in Reserved Mode : pLease Refuel");
            CurrentFuleInLiters--;
        }else{
             System.out.println("Car is Driving ");
             CurrentFuleInLiters--;
        }
       
        
    }


    public void addFuel(float fuel){
        CurrentFuleInLiters += fuel;

    }

    public float getCurrentFuelLevel(){
       return CurrentFuleInLiters; 
    }


    public static void main(String[] args) {
        //object creation..
       Car myCar = new Car();
       myCar.addFuel(6);
       myCar.drive();
       myCar.drive();
       myCar.drive();
       myCar.addFuel(6);
       myCar.drive();
       System.out.println(myCar.getCurrentFuelLevel());

    }
}