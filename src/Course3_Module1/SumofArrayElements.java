package Course3_Module1;

import java.util.Scanner;

public class SumofArrayElements
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum1 = sumElement(arr,n);
        System.out.println(sum1);
    }
}
