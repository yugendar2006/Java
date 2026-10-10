
import java.io.*;
import java.util.*;

public class Solution {

    public static void position(int[] arr, int k) {
        int j = 0;
        int[] arr2 = new int[arr.length];

        k = k % arr.length;

        for (int i = k; i < arr.length; i++) {
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < k; i++) {
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i < arr2.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        int k = Integer.parseInt(sc.nextLine().trim());

        position(arr, k);

        sc.close();
    }
}
