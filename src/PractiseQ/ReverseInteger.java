package PractiseQ;

public class ReverseInteger {
    public static int reverseInteger(int x){
        int r = 0;
        while(x != 0){
            int rem = x % 10;
            r  = r*10 + rem;
            x = x / 10;
        }
    return r;
    }

    public static void main(String[] args) {
        int x = -1234;
        int r = reverseInteger(x);
        System.out.println(r);
    }
}
