package Course3_Module1;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementArray {

    public static int search(int[] arr, int target)
    {
        int temp=0;
        for (int i=0; i< arr.length; i++)
        {
            if(target==arr[i])
            {
                temp = i;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Target from the array:");
        int target = sc.nextInt();
        System.out.println(search(arr,target));
        }
}