 import java.util.*;
class Vehicle{
    void displayBrand(String Brand){
        System.out.println("Vehicle Brand: "+Brand);
    }
}
class Car extends Vehicle {
    void displayModel(String Model) {
        System.out.println("Car Model: "+Model);
    }
}
public class VehicleInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle Brand: ");
        String Brand = sc.next();
        System.out.print("Enter car Model: ");
        String Model = sc.next();
        Car c1 = new Car();
        c1.displayBrand(Brand);
        c1.displayModel(Model);
    }
}
