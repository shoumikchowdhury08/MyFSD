package Postfix;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixtoPostfix {

    private static Map<String, Integer> priority = new HashMap<String, Integer>(){{
        put("/", 4);
        put("*", 3);
        put("+", 2);
        put("-", 1);
    }};

    public static boolean isOperator(String element){
        return element.equals("/") || element.equals("+") || element.equals("*") || element.equals("-");
    }
    public static void convertInfixtoPostfix(String[] expression){

        Stack<String> stack = new Stack<>();

        for(String element:expression){
            if(isOperator(element)){
                while(!stack.isEmpty() && priority.get(stack.peek()) <= priority.get(element)){
                    System.out.print(stack.pop()+" ");
                }
                stack.push(element);
            }
            else {
                System.out.print(element+" ");
            }
        }
    }

    public static void main(String[] args) {
        String[] expression = new String[] {"25","+","5","*","3","-","10"};
        convertInfixtoPostfix(expression);
    }
}
