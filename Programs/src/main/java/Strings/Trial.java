package Strings;

public class Trial {
    public static void main(String[] args) {
//        Object a = "Tree";
//        System.out.println(a.toString());
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(4, 4));
        System.out.println(numbers.substring(7));

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 4).length();
        System.out.println(total);
    }
}
