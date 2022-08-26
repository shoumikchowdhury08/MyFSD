package PractiseQ;

import java.util.Scanner;

public class PeakElement {

    public static int peak(int[] a) {
        int temp = 0;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i-1] > a[i])
            {
                temp = a[i-1];
            }
        }
    return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array (unsorted):");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(peak(arr));
    }
}