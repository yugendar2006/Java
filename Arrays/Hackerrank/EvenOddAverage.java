import java.io.*;
import java.util.*;

public class Solution {
   public static void evenodd(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
            sum = sum + arr[i];
            count++;
         }
      }
        System.out.println("Sum of Even elements:"+sum);
        System.out.println("Number of Even elements:"+count);
        System.out.println("Average of Even elements:"+(sum)/count);
        int sum2 = 0;
        int count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum2 = sum2 + arr[i];
                count2++;
            }
        }
        System.out.println("Sum of Odd elements:"+sum2);
        System.out.println("Number of Odd elements:"+count2);
        if(count2 == 0) {
        System.out.println("Average of Odd elements:0");
        } else {
        System.out.println("Average of Odd elements:" + (sum2 / count2));
        }
        
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        evenodd(arr);
    }
}
