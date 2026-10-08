import java.io.*;
import java.util.*;

public class Solution {
    public static void sum(int[] arr,int k){
          int count = 0;
          for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.print(count);
        
        
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      sum(arr, k);
    }
}
