package Inheritance.OverrideOnlyMethods;

class Base {
    void printVar() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    void printVar() {
        System.out.println("Derived");
    }
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        base.printVar();
        derived.printVar();
    }
}