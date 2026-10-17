import java.util.*;
class Maximum {
    void max(int a,int b){
       System.out.println("Maximum of two integers: " + Math.max(a,b));
    }
    void max(int x,int y,int z){
        System.out.println("Maximum of three integers: " + Math.max(x,Math.max(y,z)));
    }
    void max(double p,double q){
        System.out.println("Maximum of two decimal numbers: " + Math.max(p,q));
    }
}
public class MaxOverloading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter three integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print("Enter two decimal integers: ");
        double p = sc.nextDouble();
        double q = sc.nextDouble();
        Maximum m1 = new Maximum();
        m1.max(a,b);
        m1.max(x,y,z);
        m1.max(p,q);
    }
}