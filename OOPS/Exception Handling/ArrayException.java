import java.util.*;
public class ArrayException{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        try{
            System.out.println(arr[index]);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        System.out.println("Program Completed");
    }
}
