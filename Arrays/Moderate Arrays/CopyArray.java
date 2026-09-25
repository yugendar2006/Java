import java.util.*;
public class CopyArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        int[] arr2 = new int[n];
        for(int i=0;i<arr2.length;i++){
                   arr2[i]=arr[i];
        }
        System.out.println("Copied Array:");
        for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
        }
    }
}