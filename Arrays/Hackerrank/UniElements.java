import java.io.*;
import java.util.*;

public class UniElemennts {
  public static void unielements(int[] arr){
   
    for(int i=0;i<arr.length;i++){
         int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count==1){
        System.out.print(arr[i]);
    }
    }
    
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        unielements(arr);
    }
    
}
