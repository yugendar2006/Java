import java.io.*;
import java.util.*;

public class MergeDescend {
    public static void descending(int[] arr1,int[] arr2,int n1){
        int[] merged = new int[n1*2]; 
        for(int i=0;i<arr1.length;i++){
            merged[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merged[n1+i]=arr2[i];
        }
        for(int i=0;i<merged.length;i++){
            for(int j=i+1;j<merged.length;j++){
                if(merged[i] < merged[j]){
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        for(int i=0;i<merged.length;i++){
            System.out.print(merged[i]+" ");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int[] arr1 = new int[n1];
       for(int i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
       }
       int[] arr2 = new int[n1];
       for(int i=0;i<arr2.length;i++){
        arr2[i] = sc.nextInt();
       }
       descending(arr1, arr2, n1);
    }
}
