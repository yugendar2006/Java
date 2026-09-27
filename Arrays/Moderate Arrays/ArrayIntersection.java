import java.util.*;
public class ArrayIntersection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            boolean found = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found = true;
                    break;
                }
            }
            if(found==true){
                System.out.print("Intersection"+arr1[i]+" ");
            }
        }
    }
}