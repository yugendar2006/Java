import java.util.*;
class Mobile{
    String brand;
    double price;
    int ram;
    Mobile(String b,double p,int r){
        brand = b;
        price = p;
        ram = r;
    }
}
public class MobileConstructor{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String brand = sc.next();
        double price = sc.nextDouble();
        int ram = sc.nextInt();
        Mobile m1 = new Mobile(brand,price,ram);
        System.out.println("Mobile Details:");
        System.out.println("Brand"+"="+m1.brand);
        System.out.println("price"+"="+m1.price);
        System.out.println("ram"+"="+m1.ram+"GB");
    }
}