import java.io.*;
import java.util.*;

public class Solution {
   public static void sum(int[] arr){
    int maxsum = arr[0];
    for(int i=0;i<arr.length;i++){
        int sum = 0;
        for(int j=i;j<arr.length;j++){
            sum = sum + arr[j];
            if(sum>maxsum){
                maxsum = sum;
            }
        }
    }
    System.out.println(maxsum);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }
}
