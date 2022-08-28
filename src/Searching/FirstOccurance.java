package Searching;

public class FirstOccurance {

    public static int firstOccurance(int[] a, int target){
        int beg = 0, end = a.length - 1;


        while(beg <= end){
            int mid = (beg + end)/2;

            if(a[mid] == target) {
                if(a[mid - 1] == target) {
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
            else if(a[mid] < target){
               beg = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,4,4};
        int target = 2;
        int index = firstOccurance(a, target);
        System.out.println(index);
    }
}
