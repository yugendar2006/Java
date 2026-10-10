
import java.io.*;
import java.util.*;

public class Solution {
    public static void sorted(int[] arr, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[arr.length + arr2.length];

        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr.length) {
            merged[k++] = arr[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        for (int x = 0; x < merged.length; x++) {
            if (x > 0) System.out.print(" ");
            System.out.print(merged[x]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            arr[i] = Integer.parseInt(first[i]);
        }

        String[] second = sc.nextLine().trim().split("\\s+");
        int[] arr2 = new int[second.length];

        for (int i = 0; i < second.length; i++) {
            arr2[i] = Integer.parseInt(second[i]);
        }

        sorted(arr, arr2);
    }
}
