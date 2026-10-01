import java.util.*;

public class PrimeNumber{

    public static void prime(int[] arr) {

        boolean foundPrime = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 2) {
                continue;
            }

            boolean prime = true;

            for (int j = 2; j < arr[i]; j++) {

                if (arr[i] % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(arr[i] + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.print("No Prime Numbers");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        prime(arr);
    }
}