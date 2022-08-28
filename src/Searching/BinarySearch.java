package Searching;

public class BinarySearch {

    public static int binarySearch(int[] sortArray,int target)
    {
        int begin = 0, end = sortArray.length -1;

        while(begin <= end)
        {
            int mid = (begin + end)/2;
            if(sortArray[mid] == target)
            {
            return mid;
            }
            else if(sortArray[mid] < target)
            {
                begin = mid + 1;
            }
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sortArray = {1, 3, 4, 6, 8, 10 ,12};
        //int[] sortArray = {1,1,2,2,2,3,4,4};
        int target = 8;
        int index = binarySearch(sortArray, target);
        System.out.println("Index: "+ index);
    }
}

/*
[0,31]  32
[16,31] 16
[24,31] 8
[24,27] 4
[24,25] 2
[24,24] 1

n/2^k = 1
k = logn
TC: O(logn)
SC : O(n)

Best case : O(1)
If mid equals target


AC : 1+2+3.... + log(n -1)+logn
= logn (logn + 1) / 2 logn = (logn + 1) / 2 = logn/ 2 = O(logn)

[1, 3, 4, 2, 7] : target = 7
TC :
SC : O(1)

Binary Search : sort + binary search : O(n logn)
Linear Search : O(n)
 */