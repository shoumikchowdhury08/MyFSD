package Course3_Module1;
import java.util.Scanner;

public class PeakingArray {
    public static int findThePeak(int[] arr)
    {
        int temp = 0;
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i-1] > arr[i])
            {
                temp = arr[i-1];
            }
        }
    return temp;
    }


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findThePeak(arr));
    }

}
