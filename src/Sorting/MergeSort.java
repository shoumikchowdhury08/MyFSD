package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void conquer(int[] arr, int beg, int mid, int end)
    {
        int merger[] = new int[end - beg + 1];
        int p1 = beg, p2 = mid+1, x = 0;

        while (p1 <= mid && p2 <= end)
        {
            if(arr[p1] <= arr[p2])
            {
                merger[x++] = arr[p1++];
            }
            else
            {
                merger[x++] = arr[p2++];
            }
        while (p1 <= mid){
            merger[x++] = arr[p1++];
        }
        while(p2 <= end){
            merger[x++] = arr[p2++];
        }
        }
        for(int i=0, j = beg; i < merger.length; i++, j++){
                arr[j] = merger[i];
        }
    }

    public static int[] divide(int[] arr, int beg, int end)
    {
        if(beg < end)
    {
        int mid = (beg + end) / 2;
        divide(arr, beg, mid);
        divide(arr, mid + 1, end);
        conquer(arr, beg, mid, end);
    }
    return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {6,3,9,5,2,8};
        int n = arr.length;
        int[] sortedArray = divide(arr, 0, n-1);
        System.out.println(Arrays.toString(sortedArray));
    }
}
//TC: O(nlogn)
//SC: O(n)