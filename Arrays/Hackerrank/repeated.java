import java.io.*;
import java.util.*;

public class Solution {
    public static void repeat(int[] arr){
        for(int i=0;i<arr.length;i++){
           boolean alreadycounted = false;
           for(int j=0;j<i;j++){
              if(arr[i]==arr[j]){
                alreadycounted=true;
                break;
              }
           }
           if(alreadycounted){
            continue;
           }
           int count=0;
           for(int k=0;k<arr.length;k++){
            if(arr[i]==arr[k]){
                count++;
            }
           }
           System.out.println(arr[i]+" repeated "+count+" times ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        repeat(arr);
    }
}
