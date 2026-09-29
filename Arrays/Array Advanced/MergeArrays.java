import java.util.*;

public class MergeArrays {

    public static void mergearrays(int[] arr1, int[] arr2, int n1, int n2) {

        int[] mergedarray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] < arr2[j]) {
                mergedarray[k] = arr1[i];
                i++;
            }
            else {
                mergedarray[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < arr1.length) {
            mergedarray[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length) {
            mergedarray[k] = arr2[j];
            j++;
            k++;
        }

        for(int x = 0; x < mergedarray.length; x++) {
            System.out.print(mergedarray[x] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        mergearrays(arr1, arr2, n1, n2);

        sc.close();
    }
}