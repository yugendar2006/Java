class Vehicle {
    void move(){
        System.out.println("Vehicle is Moving");
    }
}
class Car extends Vehicle {
    void move() {
        System.out.println("Car is moving on four wheels");
    }
}
class Bike extends Vehicle {
    void move() {
        System.out.println("Bike is moving on two wheels");
    }
}
public class VehicleOverriding {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        Bike b1 = new Bike();
        v1.move();
        c1.move();
        b1.move();
    }
}