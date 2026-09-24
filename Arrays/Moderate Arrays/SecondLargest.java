import java.util.*;
public class SecondLargest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array: "+n);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        int Largest=arr[0];
        int SecondLargest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest=Largest;
                Largest=arr[i];
            }
            else if(arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
           
        }
         System.out.println("SecondLargest"+"="+SecondLargest);
    }
}