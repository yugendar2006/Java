import java.util.*;
abstract class Vehicle {
abstract void start();
}
class Car extends Vehicle {
    void start(){
        System.out.println("Car start with key");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start with a self start button");
    }
}
public class VehicleAbstraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("Car")){
            Car c1 = new Car();
            c1.start();
        }
        else if(name.equalsIgnoreCase("Bike")){
            Bike b1 = new Bike();
            b1.start();
        }
        else {
            System.out.println("Invalid type");
        }
    }
}