package Constructors;

class Parent{
    Parent(int i){
        System.out.println(i);
    }
}

class Child extends Parent{
    Child(){
        super(5);
        System.out.println("hi");
    }
    Child(int i){
        super(10);
        System.out.println(i);
    }

}

public class Main {
}
