package Course3_Module2;

import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        //Write your code here
        if(n<=0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
