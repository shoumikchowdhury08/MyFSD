package Course3_Module1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}