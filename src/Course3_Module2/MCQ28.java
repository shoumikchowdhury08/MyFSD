package Course3_Module2;

public class MCQ28 {
    static class Demo {
        int i = 1;

        int function() {
            if (i <= 5) {
                System.out.print(i++ + " ");
                function();
            }
            return 0;
        }

        public static void main(String[] args) {
            Demo obj = new Demo();
            obj.function();
        }
    }
}
