package JAVA_BASIC.classAndObject;

public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    //static blocks.
    // akbar srif call hota hain .. class load hone pr.
    //class load hone pr ..sabse pehele static blocks call hota hain .
    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    // normal blocks .
    //jab bhi obj craete hota hain ..tab ..sari constructor she sabshe pehele calll hota hain .
    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    //constructor

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLiters = 5;
    }

    public Car start() {
        int pop = 5;
        if (currentFuelInLiters == 0) {
            System.out.println(pop);
            System.out.println("Car is out if fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is started.. bruhhhh.....");
        }
        return this;//apne ap ko hi return kar de.internally accesss.
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentFuelInLiters=" + currentFuelInLiters +
                ", noOfSeats=" + noOfSeats +
                '}';
    }
}
