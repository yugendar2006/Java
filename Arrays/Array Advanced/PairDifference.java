import java.util.*;
public class PairDifference{
    public static void findpairDifference(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==target){
                    System.out.print(arr[i]+" "+arr[j]+" ");
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
        int target =sc.nextInt();
        findpairDifference(arr,target);
    }
}