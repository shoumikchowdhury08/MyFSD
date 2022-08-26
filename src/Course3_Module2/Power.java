package Course3_Module2;

import java.util.Scanner;

public class Power {
    public static double myPow(double a, int n) {
        //write solution code here
        int power = 1;
        for(int i = 0; i < n; i++)
        {
            power = (int) (power * a);
        }
    return power;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(myPow(a,n));
    }
}
