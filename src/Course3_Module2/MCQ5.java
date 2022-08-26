package Course3_Module2;

public class MCQ5 {

    public static int fun(int n){
        int x=1, k;
        if(n==1){
            return x;
        }
        else {
            for(k=1; k<n; ++k){
                x=x+fun(k) * fun(n-k);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fun(5));
    }
}


//    fun(5) = 1 + fun(1) * fun(4) + fun(2) * fun(3) + fun(3) * fun(2) + fun(4) * fun(1)  = 1 + 2*[fun(1)*fun(4) + fun(2)*fun(3)]
//        Substituting fun(1) = 1  = 1 + 2*[fun(4) + fun(2)*fun(3)]
//        Calculating fun(2), fun(3) and fun(4)
//        fun(2) = 1 + fun(1)*fun(1) = 1 + 1*1 = 2
//        fun(3) = 1 + 2*fun(1)*fun(2) = 1 + 2*1*2 = 5
//        fun(4) = 1 + 2*fun(1)*fun(3) + fun(2)*fun(2)  = 1 + 2*1*5 + 2*2 = 15
//        Substituting values of fun(2), fun(3) and fun(4)
//        fun(5) = 1 + 2*[15 + 2*5] = 51