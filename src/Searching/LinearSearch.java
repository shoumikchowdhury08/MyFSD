package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {6,5,3,2,4,2,1};
        int n = arr.length;
        System.out.print("Enter the target number : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 0; i<n; i++) {
            if (target == arr[i]) {
                System.out.println("Target found at index: "+ i);
            }
        }
    }
}