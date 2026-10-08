import java.io.*;
import java.util.*;

public class Solution {
    public static void majority(int[] arr){
          boolean found = false;
          for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=arr.length/2){
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
    
        if(found == false){
             System.out.println("No majority element found.");
        }
    }    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
       majority(arr);
    } 
}
