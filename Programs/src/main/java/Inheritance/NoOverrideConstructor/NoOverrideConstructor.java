package Inheritance.NoOverrideConstructor;

class Base {

    Base(){
        System.out.println("Base Constructor");
    }
    void printVarBase() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    Derived(){
        System.out.println("Derived Constructor");
    }

    void printVarDerived() {
        System.out.println("Derived");
    }
}

class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.printVarBase();

        Base derived = new Derived();
        derived.printVarBase();

        Derived derived1 = new Derived();
        derived1.printVarBase();
        derived1.printVarDerived();

    }
}