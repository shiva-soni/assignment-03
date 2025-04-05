
//Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".
// Base class
class Vehicle {
    
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}


class Car extends Vehicle {
    
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}


public class shiva {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();  

        Car myCar = new Car();
        myCar.drive();      
    }
}