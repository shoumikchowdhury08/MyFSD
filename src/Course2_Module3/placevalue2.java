package Course2_Module3;

import java.util.Scanner;

public class placevalue2 {
    public static void main(String[] args) {
        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("Error!The number has more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error!The number has less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){

            //Displays ten thousands place digit
            tenThousands = number / 10000;
            System.out.println(tenThousands);

            //Displays thousands digit
            thousands = (number % 10000) / 1000;
            System.out.println(thousands);

            //Displays hundreds place digit
            hundreds = number % 1000 / 100;
            System.out.println(hundreds);

            //Displays tens digit
            tens = (number % 100) / 10;
            System.out.println(tens);

            //Displays ones digit
            ones = number % 10;
            System.out.println(ones);
            //Error if number is less or more than five digits
        }
    }
}
