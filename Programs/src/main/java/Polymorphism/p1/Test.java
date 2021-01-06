package Polymorphism.p1;

class Base{
    protected void getThis(){
        System.out.println("Base");
    }
}

class Derived extends Base{
    public void getThis(){
        super.getThis();
    }
}

public class Test {
    public static void main(String[] args) {
        Base b = new Derived();
        Derived d = new Derived();
        b.getThis();
        d.getThis();

    }

}
