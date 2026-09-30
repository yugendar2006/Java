import java.util.*;
public class LongestConsecut{
    public static int longconsec(int[] arr){
     int max = 0;
     for(int i=0;i<arr.length;i++){
         int count = 1;
         int current = arr[i];
         while(true){
            boolean found = false;
         
         for(int j = 0; j < arr.length; j++) {
                if(arr[j] == current + 1) {
                    found = true;
                    break;
                }
            }
            if(found) {
                count++;
                current++;
            }
            else {
                break;
            }
        }
        if(count > max) {
            max = count;
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
         int result = longconsec(arr);

        System.out.println(result);
    }
}