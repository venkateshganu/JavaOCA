package ErrorsAndExceptions.p1;

class Base {
    int id = 1000; //Line n1

    Base() {
        Base(); //Line n2
    }

    void Base() { //Line n3
        System.out.println(++id); //Line n4
    }
}

class Derived extends Base {
    int id = 2000; //Line n5

    Derived() {} //Line n6

    void Base() { //Line n7
        System.out.println(id); //Line n8
    }
}

public class Test {
    public static void main(String[] args) {
        Derived base = new Derived(); //Line n9

        String str1 = "", str2 = "";

        System.out.println(str1.contentEquals(str2));
    }
}