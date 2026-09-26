import java.util.*;
public class MissingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found = true;
                    break;
                }
            }
                if(found == false){
                    System.out.print("Missing Number = "+i);
                    break;
                }
            }
        }
    }
