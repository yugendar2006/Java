import java.util.*;
public class MaxSubArray{
    public static int maxproduct(int[] arr){
        int max = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        int product = 1;
        for(int j=i;j<arr.length;j++){
            product = product * arr[j];
            if(product>max){
            max = product;
            }
        }
      }
      return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       int result = maxproduct(arr);
       System.out.print(result);
    }
}