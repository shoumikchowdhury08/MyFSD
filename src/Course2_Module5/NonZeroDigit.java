package Course2_Module5;

import java.util.Scanner;

public class NonZeroDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    static int lastNonZeroDigit(int n) {
        int temp = 1;
        for (int i = 0; i < n; i++) {
            temp *= (n - i);
            if (temp % 10 == 0) {
                temp = temp / 10;
            } else {
                temp = temp % 10;
            }
        }
        return temp;
    }
}