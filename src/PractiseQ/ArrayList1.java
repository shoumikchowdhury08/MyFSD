package PractiseQ;

import java.util.ArrayList;

public class ArrayList1 {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int element : arr){
            System.out.println(element);
            System.out.println(element*element);
        }
    }

}
