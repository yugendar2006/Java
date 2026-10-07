import java.util.*;

public class Solution {
    public static void secondlarge(int[] arr) {
        int max = arr[0];
        int secondlarge = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondlarge = max;
                max = arr[i];
            } else if (arr[i] > secondlarge || (max == secondlarge && arr[i] == max)) {
                secondlarge = arr[i];
            }
        }

        System.out.print(secondlarge);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        secondlarge(arr);
    }
}
