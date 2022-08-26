package Course3_Module2;

import java.util.Scanner;

public class PowerRecursion {

    public static double myPow(double a, int n) {
        //write solution code here
        if(n<=0){
            return 1;
        }
        return a * myPow(a,n-1);
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(a,n));
    }
}
