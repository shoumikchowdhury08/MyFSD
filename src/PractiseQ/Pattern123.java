package PractiseQ;

public class Pattern123 {

    public static void main(String[] args) {

        //int[][] a = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] a = new int[3][5];
        int value = 1;

        for (int i = 0; i < 3; i++){
            for(int j=0; j<5; j++){
                a[i][j] = value;
                value++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
            }
        }
}
