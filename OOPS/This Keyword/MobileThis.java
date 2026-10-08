import java.util.*;
class Mobile{
    String brand;
    double price;
    int ram;
    Mobile(String brand,double price,int ram){
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }
}
public class MobileThis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String brand = sc.next();
        double price = sc.nextDouble();
        int ram = sc.nextInt();
        Mobile m1 = new Mobile(brand,price,ram);
        System.out.println("Mobile Details: ");
        System.out.println("brand name "+"= "+ m1.brand);
        System.out.println("price "+"= "+ m1.price);
        System.out.println("ram "+"= "+ m1.ram+"GB");
    }
}