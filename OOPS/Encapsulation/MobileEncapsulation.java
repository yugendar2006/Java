import java.util.*;
class Mobile{
    private String Brand;
    private double Price;

    Mobile(String Brand,double Price){
        this.Brand = Brand;
        this.Price = Price;
    }

    public String getBrand(){
          return Brand;
    }
    public double getPrice(){
        return Price;
    }

    public void setBrand(String Brand){
        this.Brand = Brand;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }
}
public class MobileEncapsulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile Brand: ");
        String Brand = sc.next();
        System.out.print("Enter mobile price: ");
        double Price = sc.nextDouble();
        Mobile m1 = new Mobile(Brand,Price);
        System.out.println("Brand"+"="+m1.getBrand());
        System.out.println("Price"+":"+m1.getPrice());
        System.out.print("Enter New brand: ");
        String NewBrand = sc.next();
        m1.setBrand(NewBrand);
        System.out.print("Enter new price: ");
        double NewPrice = sc.nextDouble();
        m1.setPrice(NewPrice);
        System.out.println("Updated Brand: "+m1.getBrand());
        System.out.println("Updated Price: "+m1.getPrice());
    }
}