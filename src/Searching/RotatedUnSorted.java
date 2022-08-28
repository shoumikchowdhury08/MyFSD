package Searching;

public class RotatedUnSorted {
    public static int rotatedSorted(int[] a, int target){
        int beg = 0, end = a.length -1;
        while(beg<=end){
            int mid = (beg+end)/2;

            if(target == a[mid]){
                return mid;
            }
            else if(a[beg]<a[mid]){
                if (target>=a[beg] && target<a[mid]){
                    end = mid - 1;
                }
                else{
                    beg = mid + 1;
                }
            }
            else{
                if(a[mid] < target && target <= a[end]){
                    beg = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = {4,7,8,10,1,2,3};
        int target = 2;
        int index = rotatedSorted(a, target);
        System.out.println(index);
    }
}
