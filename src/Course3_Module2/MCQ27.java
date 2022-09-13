package Course3_Module2;

public class MCQ27 {

    static class Main{
        public static int fn(int n)
        {
            int x=1, k;
            if(n == 1) return x;
            for (k = 1; k<n; ++k){
                x=x+fn(k) * fn(n-k);
            }
            return x;
        }
        public static void main(String[] args){
            System.out.println(fn(5));
        }
    }
}
