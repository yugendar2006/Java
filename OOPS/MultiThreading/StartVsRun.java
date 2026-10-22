class MyTask extends Thread{
    public void run(){
        System.out.println("Child Thread");
    }
}
public class StartVsRun{
    public static void main(String[] args){
        MyTask m1 = new MyTask();
        m1.run();
        System.out.println("Main Thread");
       
    }
}