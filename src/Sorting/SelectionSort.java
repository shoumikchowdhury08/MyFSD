package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int minVal = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++)
            {
                   if (minVal > arr[j])
                   {
                       minVal = arr[j];
                       minIndex = j;
                   }
            }
            int temp = arr[i];          // keep the assumed min value in temp
            arr[i] = minVal;            // assign min value to the a[i] th position
            arr[minIndex] = temp;       // assign assumed min value in the 2nd position
        }
        return arr;
    }
// assume the first element as the minimum value and compare it with the other values,
// if the first element is larger than any other value then swap the positions using index
    public static void main(String[] args)
    {
        int[] arr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        SelectionSort sSort = new SelectionSort();
        System.out.println(Arrays.toString(sSort.selectionSort(arr)));
    }
}
