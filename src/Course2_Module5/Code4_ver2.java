package Course2_Module5;

import java.util.Scanner;

public class Code4_ver2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();

        //write your code here
        for (int i =1;i<=numberOfLines;i++) {
            for (int j = numberOfLines;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
