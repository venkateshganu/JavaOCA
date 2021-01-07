package MethodHiding;

class Base {
    public int num = 10;
    public static int num1 = 10;
    public void printStatement(){
        System.out.println("Print this Base");
    }
    public static void printStatement1(){
        System.out.println("Print this Base");
    }
}

class Child extends Base{
    public int num = 20;
    public static int num1 = 20;
    public void printStatement(){
        System.out.println("Print this child");
    }
    public static void printStatement1(){
        System.out.println("Print this child");
    }

}

public class Test {
    public static void main(String[] args) {
        Base b = new Child();

//        System.out.println(b.num);
//        System.out.println(b.num1);

        b.printStatement();
        b.printStatement1();
    }
}
