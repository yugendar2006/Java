import java.util.*;
public class MoveZeroes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int position = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[position]=arr[i];
                position++;
            }
        }
        for (int i = position; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
        
    }
}