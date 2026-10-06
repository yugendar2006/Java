import java.util.*;
class Book{
    String title;
    String author;
    float price;
}
public class BookDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        float price = sc.nextFloat();
        Book b1 = new Book();
        b1.title = title;
        b1.author = author;
        b1.price = price;
        System.out.println("Book Details:");
        System.out.println("Title"+"="+title);
        System.out.println("author"+"="+author);
        System.out.println("price"+"="+price);
    }
}