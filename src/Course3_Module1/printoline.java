package Course3_Module1;

public class printoline {

    public static void main(String[] args) {
        int[] a = new int[4];
        a[0]=1;
        int temp = 0;
        for (int i= 0; i < 4; i++){
            temp += a[i];
            System.out.print(temp+ " ");
        }
    }
}
