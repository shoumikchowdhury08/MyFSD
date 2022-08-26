package Course3_Module2;

import java.util.Scanner;

public class ReverseNumberRec {

    // Method to reverse the digits of an integer
    static void reverseInteger(int n) {
        // Write your code here
        int length = 0;
        long temp = 1;
        int rev = 0;
        while (temp <= n) {
            length++;
            temp *= 10;
        }

        for(int i = 0; i < length; i++) {
            rev = n % 10;
            System.out.print(rev);
            n = n / 10;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseInteger(n);
    }
}
