package Course3_Module1;

import java.util.Scanner;


public class Source {
    public static int[] checkPrime(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {
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


        return arr;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = checkPrime(arr);

        for(int i=0; i<res.length; i++) {
            if(i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }
}
