import java.util.*;
class Payment {
    void pay() {
        System.out.println("Making a payment");
    }
}
class Upi extends Payment {
    void pay() {
        System.out.println("Payment through UPI");
    }
}
class Card extends Payment {
    void pay() {
        System.out.println("Payment through Card");
    }
}
class Cash extends Payment {
    void pay() {
        System.out.println("Payment through Cash");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        if(type.equalsIgnoreCase("Upi")){
            Upi u1 = new Upi();
            u1.pay();
        }
        else if(type.equalsIgnoreCase("Card")){
            Card c1 = new Card();
            c1.pay();
        }
        else if(type.equalsIgnoreCase("Cash")){
            Cash h1 = new Cash();
            h1.pay();
        }
        else {
            System.out.println("Invalid payment type");
         }
    }
}
