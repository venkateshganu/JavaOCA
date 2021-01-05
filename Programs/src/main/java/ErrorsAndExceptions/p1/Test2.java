package ErrorsAndExceptions.p1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

//public class Test2 {
//    public static void main(String[] args) {
//        try {
//            System.out.println(args[1].length());
//        } catch (RuntimeException ex) {
//            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
//        }
//        System.out.println("THREE");
//    }
//}

public class Test2 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>(); //Line n1
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4)); //Line n2
        System.out.println(list);
    }
}