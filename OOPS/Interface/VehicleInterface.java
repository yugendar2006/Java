import java.util.*;
interface Vehicle{
     void start();
}
class Car implements Vehicle {
    public void start(){
        System.out.println("Car will starts");
    }
}
class Bike implements Vehicle {
    public void start(){
        System.out.println("Bike will starts");
    }
}
public class VehicleInterface {
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
        else{
            System.out.println("Invalid Vehicle");
        }
    }
}