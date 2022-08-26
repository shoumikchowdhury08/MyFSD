package Sorting;

import java.util.Arrays;

public class InsertionSort {
        public static void main(String[] args) {
            int [] arr = {5,4,1,2,3};
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void insertionSort(int[] arr)
        {
            int n = arr.length;
            for (int i = 1; i< n; i++){    // loop for unsorted elements
                int current = arr[i];   //in unsorted part (current element pick and place in the sorted part)  //i means whole unsorted part
                int j = i - 1;
                while(j >= 0 && arr[j] > current) {   //sorted part tracking we are using j, if the value of j is greater than current it gives place for current
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j = j-1;
                }
                arr[j+1] = current;
            }
        }
}