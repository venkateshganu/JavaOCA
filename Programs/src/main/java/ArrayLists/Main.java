package ArrayLists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("a");
        al.add("d");
        al.add("f");

        for(String a: al){
            if(a.equals("a"))
                al.remove(a);
        }

        System.out.println(al);

    }
}
