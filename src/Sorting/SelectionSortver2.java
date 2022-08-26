package Sorting;

import java.util.Arrays;

public class SelectionSortver2 {

    public static int[] selectionSortver2(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[j+1])
                {
                   min = j;
                }
            }
            if(min != i)
            {
                int temp = arr[i];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
     int[] arr = {64, 25, 12, 22, 11};
     SelectionSortver2 selSort = new SelectionSortver2();
     System.out.println(Arrays.toString(selSort.selectionSortver2(arr)));
    }
}