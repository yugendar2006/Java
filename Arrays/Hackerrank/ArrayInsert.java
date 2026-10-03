import java.io.*;
import java.util.*;

public class Solution {

    // Function to take array input
    public static int[] inputArray(int n, Scanner sc) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    // Function to insert element
    public static int[] insert(int[] arr, int position, int element) {

        int n = arr.length;
        int[] newArr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {

            if (i == position - 1) {
                newArr[i] = element;
            }
            else if (i < position - 1) {
                newArr[i] = arr[i];
            }
            else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    // Function to print array
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of elements
        int n = sc.nextInt();

        // Take array input
        int[] arr = inputArray(n, sc);

        // Position
        int position = sc.nextInt();

        // Element
        int element = sc.nextInt();

        // Check position
        if (position < 1 || position > n + 1) {
            System.out.println("Invalid position");
            return;
        }

        // Insert element
        int[] newArr = insert(arr, position, element);

        // Print array
        printArray(newArr);
    }
}
