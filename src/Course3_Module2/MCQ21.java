package Course3_Module2;

public class MCQ21 {

    public static void recursive_function(int n){
        if(n==1)
            return;

        System.out.println(n);
        recursive_function(n-1);
    }
    public static void main(String[] args)
    {
        recursive_function(10);
    }
}
