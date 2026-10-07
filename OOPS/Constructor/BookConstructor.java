class BookDetails{
      String title;
      double price;
      BookDetails(String t,double p){
        title = t;
        price = p;
      }
}
public class BookConstructor{
    public static void main(String[] args){
        BookDetails b1 = new BookDetails("JavaBasics",299.5);
        BookDetails b2 = new BookDetails("Python",350.7);
        System.out.println("Book1:");
        System.out.println("Title"+"="+b1.title);
        System.out.println("Price"+"="+b1.price);
        System.out.println("Book2:");
        System.out.println("Title"+"="+b2.title);
        System.out.println("Price"+"="+b2.price);
    }
}