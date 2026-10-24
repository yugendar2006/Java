import java.util.*;
class NumberThreadDemo extends Thread {
    int n;
    NumberThreadDemo(int n){
        this.n = n;
    }
    public void run(){
       for(int i=1;i<=n;i++){
        System.out.println(i);
       }
    }
}
public class NumberThread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberThreadDemo t1 = new NumberThreadDemo(n);
        t1.start();
        System.out.println("Main Completed");
    }
}