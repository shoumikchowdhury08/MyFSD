package String;

public class BasicStringExample {
    public static void main(String args[]){
        String s1="Bro";//creating string by Java string literal
        char ch[]={'s','h','o','u','m','i','k'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.concat(" code"); // this does not gives the out as the strings are immutable
        System.out.println(s1);
        s1 = s1.concat(" code");
        System.out.println(s1);
    }
}
