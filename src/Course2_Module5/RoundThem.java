package Course2_Module5;

public class RoundThem {
    public static void main(String[] args) {
//        float f1 = (float) 3.34;
//        float number1 = 0;
//        number1 = Math.round(f1);
//        System.out.println(number1);

        double[] array = {10.32,20.36,30.50,40.51,50.49,60.43,71.71};
        double number = 0;
        for (int i = 0; i < array.length; i++){
            number =  Math.round(array[i]);
            System.out.print(number+" ");
        }
    }
}
