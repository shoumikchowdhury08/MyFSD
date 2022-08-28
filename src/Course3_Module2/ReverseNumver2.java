package Course3_Module2;

import java.util.Scanner;

public class ReverseNumver2 {

    static void reverseInteger(int n) {
        int r = 0;
        while(n != 0){
            int rem = n % 10;
            r = r * 10 + rem;
            n = n / 10;

        }
        System.out.println(r);
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseInteger(n);
    }
}
