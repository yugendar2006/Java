import java.util.*;
public class kthSmallest{
    public static int findkthsmallest(int[] arr,int k){
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
     }
     int index = arr.length - k;
     System.out.print(arr[index]);
     return arr[index];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findkthsmallest(arr,k);
    }
}