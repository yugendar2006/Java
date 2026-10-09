import java.io.*;
import java.util.*;

public class Solution {

    public static void oddtimes(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // Check if this element was already processed
            boolean alreadySeen = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadySeen = true;
                    break;
                }
            }

            if (alreadySeen) {
                continue;
            }

            // Count occurrences
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check odd occurrence
            if (count % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        oddtimes(arr);
    }
}
