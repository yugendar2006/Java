import java.io.*;
import java.util.*;

public class Solution {

    public static void zeroelements(int[] arr) {

        boolean anyFound = false;

        for (int i = 0; i < arr.length; i++) {

            int number = arr[i];
            boolean found = false;

            while (number > 0) {

                int digit = number % 10;

                if (digit == 0) {
                    found = true;
                    break;
                }

                number = number / 10;
            }

            if (found) {
                System.out.print(arr[i] + " ");
                anyFound = true;
            }
        }

        if (!anyFound) {
            System.out.print("No Numbers Having 0");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        zeroelements(arr);
    }
}
