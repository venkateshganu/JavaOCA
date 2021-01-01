package Inheritance.OverrideOnlyMethods;

class MainBase {
    void myMethod() throws ExceptionInInitializerError {
        System.out.println("Base");
    }
}
class MainDerived extends MainBase {
    void myMethod() throws RuntimeException {
        System.out.println("Derived");
    }
}
public class Main1 {
    public static void main(String args[]) {
        MainBase obj = new MainDerived();
        obj.myMethod();
    }
}