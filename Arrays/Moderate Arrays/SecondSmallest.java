import java.util.*;
public class SecondSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array Size: "+n);
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int Smallest = arr[0];
        int SecondSmallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<Smallest){
             SecondSmallest=Smallest;
             Smallest=arr[i];
            }
            else if(arr[i]<SecondSmallest){
                SecondSmallest=arr[i];
            }
        }
        System.out.println("Second Smallest"+"="+SecondSmallest);
    }
}