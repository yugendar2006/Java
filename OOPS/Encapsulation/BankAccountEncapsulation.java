import java.util.*;
class BankAccount{
    private String AccountHolder;
    private double Balance;

    BankAccount(String AccountHolder,double Balance){
        this.AccountHolder = AccountHolder;
        this.Balance = Balance;
    }

    public String getAccountHolder(){
        return AccountHolder;
    }
    public double getBalance(){
        return Balance;
    }

    public void setAccountHolder(String AccountHolder){
        this.AccountHolder = AccountHolder;

    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
}
public class BankAccountEncapsulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account holder name: ");
        String AccountHolder = sc.next();
        System.out.print("Enter initial balance: ");
        double Balance = sc.nextDouble();
        BankAccount b1 = new BankAccount(AccountHolder,Balance);
        System.out.println("Account Holder: "+b1.getAccountHolder());
        System.out.println("Initial Balance: "+b1.getBalance());
        System.out.print("Enter New Balance: ");
        double NewBalance = sc.nextDouble();
        b1.setBalance(NewBalance);
        System.out.println("UpdatedBalance: "+b1.getBalance());
    }
}