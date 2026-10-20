import java.util.*;
interface Payment{
    void Pay(String message);
}
 class Upi implements Payment{
    String message;
    Upi(String message){
        this.message = message;
    }
    public void Pay(String message){
        System.out.println(message);
    }
}
 class Cash implements Payment{
    String message;
    Cash(String message){
        this.message = message;
    }
    public void Pay(String message) {
        System.out.println(message);
    }
}
public class PaymentInterface {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String message = sc.nextLine();
        if(name.equalsIgnoreCase("upi")){
            
            Upi u1 = new Upi(message);
            u1.Pay(message);
        }
        else if(name.equalsIgnoreCase("cash")){
            Cash c1 = new Cash(message);
            c1.Pay(message);
        }
        else{
            System.out.println("Invalid name");
        }
    }
}