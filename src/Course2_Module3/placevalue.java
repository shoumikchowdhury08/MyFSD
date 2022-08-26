package Course2_Module3;

import java.util.Scanner;

public class placevalue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number >= 99999) {
            System.out.println("Error! Number more than 5 digits.");
        } else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        } else if (number>=10000 && number<= 99999) {
            //WRITE YOUR CODE HERE
            int tenThousands = number / 10000;
            int thousands = number % 10000 / 1000;
            int hundreds = number % 1000 / 100;
            int tens = number % 100 / 10;
            int ones = number % 10;

            System.out.println(tenThousands);
            System.out.println(thousands);
            System.out.println(hundreds);
            System.out.println(tens);
            System.out.println(ones);
        }
    }
}
