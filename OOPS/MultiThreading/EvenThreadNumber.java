import java.util.*;
class MyThread extends Thread{
    int n;
    MyThread(int n){
        this.n = n;
    }
    public void run(){
        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
public class EvenThreadNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyThread t1 = new MyThread(n);
        t1.start();
        System.out.println("Main Completed");
    }
}