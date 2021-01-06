package ClassCastingAndPromotion;

class Parent{}

class Child extends Parent{}

public class ClassCasting {
    public static void main(String[] args) {
        Parent b = new Parent();

        Child c = new Child();

        Parent b1 = new Child();

        Child c2 = (Child) b1;


    }
}
