package Course3_Module1;

import java.util.Scanner;

public class matrixPrinto {
    public static void main(String[] args) {
        //System.out.println("Please input the size of matrix:");
        //Scanner size = new Scanner(System.in);
        int temp = 0;
        int[][] a = new int[4][4];
        a[0][0] = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                temp = a[i][j] + 1;
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
