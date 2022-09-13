//package Course3_Module2;
//
//import java.util.Scanner;
//
//public class CapatalizeWord {
//    public static String[] convertToUpper(String[] arr) {
//        //Add code here
//        for(int i = 0; i < arr.length; i++){
//
//            if('a' <= arr[i] && arr[i] <= 'z'){
//                arr[i] = (String) arr[i] - 32;
//            }
//            System.out.println(arr[i]);
//        }
//    return arr;
//    }
//    public static void main(String args[] ) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String[] arr = new String[n];
//
//        sc.nextLine();
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextLine();
//        }
//
//        String[] res = convertToUpper(arr);
//
//        for(int i=0; i<res.length; i++) {
//            System.out.println(res[i]);
//        }
//    }
//}