package Course3_Module2;

import java.util.Scanner;

public class SumofDigits {

        public static int sum(int n) {
            //write your code here
            int add = 0;
            int temp = 0;
            while (n > 0) {

                temp = n % 10;
                add = add + temp;
                n = n / 10;
            }
            return add;
        }
        public static void main(String[] args) {
            //read the input number
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //pass the number to sum() method
            System.out.println(sum(n));
        }
}
