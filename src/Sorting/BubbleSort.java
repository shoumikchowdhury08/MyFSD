package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
// 2 loops and compare the j and j+1 indexed values, if j is greater than j+1 then swap, trap 2 element in bubble
    public static void main(String[] args)
    {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        BubbleSort bSort = new BubbleSort();
        System.out.println(Arrays.toString(bSort.bubbleSort(numbers)));
    }
}