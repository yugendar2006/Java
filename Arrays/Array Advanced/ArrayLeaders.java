import java.util.*;
public class ArrayLeaders{
    public static void findLeaders(int[] arr){
      for(int i=0;i<arr.length;i++){
        boolean leader = true;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
              leader = false;
              break;
            }
        }
        if(leader){
            System.out.print(arr[i]+" ");
           }
         }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        findLeaders(arr);
    }
}