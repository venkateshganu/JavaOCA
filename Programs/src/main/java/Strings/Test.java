package Strings;

public class Test {
    public static void main(String [] args) {
        String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());
    }
}
