package StringBuilders;

public class Sb1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.delete(0,sb1.length());
        System.out.println(sb1);
    }
}
