import java.io.*;
import java.util.*;

public class Solution {
   public static void deleteelement(int[] arr,int k){
     boolean found = false;
    for(int i=0;i<arr.length;i++){
        if(k==arr[i]){
            found = true;
        }
    }
     if(found){
          for(int i=0;i<arr.length;i++) {
          if(k!=arr[i]){
            System.out.print(arr[i]+" ");
           }
         }
         } else {
            System.out.print("No element found to delete");
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
        deleteelement(arr, k);
    }
}
