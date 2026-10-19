import java.util.*;
abstract class BankAccount{
    abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
    int balance;
    SavingsAccount(int balance){
        this.balance = balance;
    }
    void calculateInterest(){
        int interest = (balance * 5)/100;
        System.out.println("SavingsAccount: " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    int balance;
    FixedDepositAccount(int balance) {
        this.balance = balance;
    }
    void calculateInterest(){
        int interest = (balance * 7)/100;
        System.out.println("FixedDeposit " + interest);
    }
}
public class BankAccountAbstract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equalsIgnoreCase("savingsaccount")){
            int balance = sc.nextInt();
            SavingsAccount s1 = new SavingsAccount(balance);
             s1.calculateInterest();
        }
        else if(name.equalsIgnoreCase("FixedDepositAccount")) {
            int balance = sc.nextInt();
            FixedDepositAccount f1 = new FixedDepositAccount(balance);
            f1.calculateInterest();
        }
        else{
            System.out.println("Invalid Account");
        }
    }
}