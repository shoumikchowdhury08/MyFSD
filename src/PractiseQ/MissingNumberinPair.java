package PractiseQ;

public class MissingNumberinPair {
//https://docs.google.com/document/d/15L1D4LnviNmUY4jm6EhaUyxKzVvraGNl1zQbAJ51K30/edit#heading=h.4w9lljlp3wen
    public static int missingNumber(int[] a){
        int beg = 0, end = a.length -1;
        while(beg < end){
            int mid = (beg+end)/2;

            //1. if a[mid] is single >> return a[mid]
            if(mid==0 || mid==a.length -1 || a[mid] != a[mid-1] && a[mid] != a[mid+1]) {
                return a[mid];
            }
            //2. the first occurance at even index then move right > beg = mid + 1
            int firstOccurance = mid;
            if (a[mid] == a[mid+1]){
                firstOccurance = mid - 1;
            }
            if (firstOccurance%2 == 0){
                beg = mid + 1;
            }
            else{
                end = mid - 1;
            }
            //3. the first occurance at odd then move >> end = mid - 1
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,3,4,4,2,2,3,3,1,2,2};
        int m = missingNumber(a);
        System.out.println("Missing Number "+ m);
    }
}
