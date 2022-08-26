package Course3_Module2;

public class MCQ9 {
    public static int func(int n){
        if(n<=1){
            System.out.print(n);
        }
        else {
            System.out.print(n%2);
            func(n/2);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(func(25));
    }

}
