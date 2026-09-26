import java.util.*;
public class CommonElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        System.out.println("Common Elements: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }
}
