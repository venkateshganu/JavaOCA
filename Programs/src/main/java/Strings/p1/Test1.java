package Strings.p1;
//
// class Test2 {
//    public static void main(String[] args) {
//        String str = "Game on"; //Line n1
//        StringBuilder sb = new StringBuilder(str); //Line n2
//
//        System.out.println(str.contentEquals(sb)); //Line n3
//        System.out.println(sb.contentEquals(str)); //Line n4
//        System.out.println(sb.equals(str)); //Line n5
//        System.out.println(str.equals(sb)); //Line n6
//    }
//}

public class Test1 {
    public static void main(String[] args) {
        byte b1 = 10; //Line n1
        int i1 = b1; //Line n2
        byte b2 = (byte)i1; //Line n3
        System.out.println(b1 + i1 + b2);
    }
}
