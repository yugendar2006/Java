import java.util.*;
class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name = name;
        this.price = price;
    }
}
public class ProductThis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double price = sc.nextDouble();
        Product p1 = new Product(name,price);
        System.out.println("Product Details: ");
        System.out.println("name"+"="+p1.name);
        System.out.println("price"+"="+p1.price);
    }
}