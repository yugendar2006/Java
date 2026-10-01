import java.util.*;
public class SubArraySum{
    public static void findsubarray(int[] arr,int target){
        for(int i=0;i<arr.length;i++){ 
            int sum = 0;    
            for(int j=i;j<arr.length;j++){   
            sum = sum + arr[j];
            if(sum==target){
            for(int k=i;k<=j;k++){
            System.out.print(arr[k]+" ");
                 }
                return;
            }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        findsubarray(arr,target);
    }
}