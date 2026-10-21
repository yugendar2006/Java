import java.util.*;
public class MultipleCatchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        try {
            int result = a/b;
            System.out.println(result);
            System.out.println(arr[index]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        System.out.println("Completed");


    }
}