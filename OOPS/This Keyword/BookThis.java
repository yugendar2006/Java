import java.util.*;
class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class BookThis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        String author = sc.next();
        double price = sc.nextDouble();
        Book b1 = new Book(title,author,price);
        System.out.println("Book Details:");
        System.out.println("Title"+"="+b1.title);
        System.out.println("Author"+"="+b1.author);
        System.out.println("price"+"="+b1.price);
    }
}
