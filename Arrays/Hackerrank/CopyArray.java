import java.io.*;
import java.util.*;

public class Solution {
  public static void CopyArray(int[] arr1,int[] arr2){
    for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
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
    CopyArray(arr1, arr2);
    }
}
