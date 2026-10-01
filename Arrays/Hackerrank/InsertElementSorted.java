import java.io.*;
import java.util.*;

public class InsertElementSorted{
    public static void insert(int[] arr,int k){
        int[] result = new int[arr.length+1];
        int i=0;
        int j=0;
        while(i<arr.length && arr[i]<k){
           result[j] = arr[i];
            i++;
            j++;
        }
        result[j] = k;
        j++;
        while (i < arr.length) {
            result[j] = arr[i];
            i++;
            j++;
        }
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
       int k = sc.nextInt();
       insert(arr,k);
    }
}