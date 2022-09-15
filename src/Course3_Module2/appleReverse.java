package Course3_Module2;

import java.util.Scanner;

public class appleReverse {
    public static String reverse(String str) {

        if (str == null || str.length()<=1){
            return str;
        }
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }

    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}
