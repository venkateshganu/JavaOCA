package MethodHiding;

class Base {
    public static void printStatement(){
        System.out.println("Print this Base");
    }
}

class Child extends Base{
    public static void printStatement(){
        System.out.println("Print this child");
    }

}

public class Test {
    public static void main(String[] args) {
        Base b = null;
        b.printStatement();
    }
}
