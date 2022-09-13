package Course3_Module2;

public class MCQ24 {
    static class Main{
        public static void print(int n){
            if(n<1) return;
            print(n-1);
            print(n-3);
            System.out.println(n);
        }

        public static void main(String[] args){
            print(6);
        }
    }
}
