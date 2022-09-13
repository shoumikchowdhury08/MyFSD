package PractiseQ;

public class SquareRoot {
    public static int squareRoot(int x) {
        int beg = 1, end = x;
        int result = 1;
        while (beg < end) {
            int mid = (beg + end) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                beg = mid + 1;
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 16;
        int sqr_root = squareRoot(x);
        System.out.println(sqr_root);
    }
}
