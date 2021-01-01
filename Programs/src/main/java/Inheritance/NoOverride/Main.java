package Inheritance.NoOverride;

class Base {
    String var = "Base class idhi";

    void printBase() {
        System.out.println(var);
    }
}

class Derived extends Base {
    String var = "Derived class idhi";

    void printDerived() {
        System.out.println(var);
    }
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        Derived derived1 = new Derived();

        System.out.println(base.var);
        System.out.println(derived.var);
        System.out.println(derived1.var);

        base.printBase();
        derived.printBase();
//        derived.printDerived();
        derived1.printBase();
        derived1.printDerived();
    }
}