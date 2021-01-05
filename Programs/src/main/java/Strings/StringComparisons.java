package Strings;


public class StringComparisons {

    public static void main(String[] args) {
        String a ="Hello World";
        String b = "Hello World";

        System.out.println(a == b); //True
        System.out.println(a.equals(b)); //True

        String x = "Hello World";
        String y = new String("Hello World");

        System.out.println(x == y); //False
        System.out.println(x.equals(y)); //True

        String s = "Hello World";
        StringBuilder sb1 = new StringBuilder("Hello World");

        System.out.println(s == sb1.toString()); //False
        System.out.println(s.equals(sb1.toString())); //True

        String c = "Hello ";

        System.out.println(x == c+"World"); //False
        System.out.println(x.equals(c+"World")); //True

        System.out.println(y == c+"World"); //False
        System.out.println(y.equals(c+"World")); //True

    }

}
