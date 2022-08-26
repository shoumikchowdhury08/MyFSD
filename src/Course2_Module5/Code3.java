package Course2_Module5;

import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Enter the two numbers in the input console
    int number1 = scan.nextInt();
    int number2 = scan.nextInt();
    System.out.print(lcm(number1, number2));
}
public static int lcm(int number1, int number2){
        // Write the logic of function here
    int max = 0;
    if(number1 > number2){
        max = number1;
    }
    else{
        max = number2;
    }

    while(true){
        if (max % number1 == 0 && max % number2 == 0){
            break;
        }
        else{
            max++;
        }
     }
    return max;
}
}
