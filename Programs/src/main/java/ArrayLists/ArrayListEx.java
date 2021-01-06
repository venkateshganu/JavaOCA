package ArrayLists;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

//                a.set(0, "See");
        a.add("See");
        a.add("My");
        a.add("Phone");
        a.remove("See");

        a.set(0, "Check");
        a.set(1, "Msg");

        a.addAll(a);
        System.out.println(a.addAll(a));

    }
}

