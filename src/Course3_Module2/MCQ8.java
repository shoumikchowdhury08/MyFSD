package Course3_Module2;

public class MCQ8 {

    public static int fun(int x){
        if(x>0){
            fun(--x);
            System.out.print(x+" ");
            fun(x--);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fun(4));
    }
}