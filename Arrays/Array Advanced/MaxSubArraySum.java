import java.util.*;
public class MaxSubArraySum {
    public static int MaxSubArraySum(int[] arr){
       
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum>max){
                    max =sum;
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
        int result = MaxSubArraySum(arr);
        System.out.println(result);
    }
}