import java.util.*;
class Product{
    private String Name;
    private double Price;

    Product(String Name,double Price){
        this.Name = Name;
        this.Price = Price;
    }

    public String getName(){
        return Name;
    }
    public double getPrice(){
        return Price;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setPrice(double Price){
        this.Price = Price;
    }
}
public class ProductEncapsulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String Name = sc.next();
        System.out.print("Enter product price: ");
        double Price = sc.nextDouble();
        Product p1 = new Product(Name,Price);
        System.out.println("Product Name: " + p1.getName());
        System.out.println("Product Price: " + p1.getPrice());
         System.out.print("Enter updated price: ");
        double newPrice = sc.nextDouble();
        p1.setPrice(newPrice);
        System.out.println("Updated Price: " + p1.getPrice());
    }
}