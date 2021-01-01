package Inheritance.OverrideConstructors;

class Base {

    Base(){
        System.out.println("Base Constructor");
    }
    void printVar() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    Derived(){
        System.out.println("Derived Constructor");
    }

    void printVar() {
        System.out.println("Derived");
    }
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.printVar();

        Base derived = new Derived();
        derived.printVar();

        Derived derived1 = new Derived();
        derived1.printVar();
    }
}