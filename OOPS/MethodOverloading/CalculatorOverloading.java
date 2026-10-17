import java.util.*;
class Calculator {
    void calculator(int a,int b){
        System.out.println("Sum: " + (a+b));
    }
    void calculator(int x,int y,int z){
        System.out.println("Product: " + (x*y*z));
    }
    void calculator(double p,double q){
        System.out.println("Division: " + (p/q));
    }
}
public class CalculatorOverloading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter three digits: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print("Enter two decimals: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        Calculator c1 = new Calculator();
        c1.calculator(a,b);
        c1.calculator(x,y,z);
        c1.calculator(p,q);
    }
}