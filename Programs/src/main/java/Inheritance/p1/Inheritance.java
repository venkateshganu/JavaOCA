package Inheritance.p1;
class A{
    int i;
}

class B extends A{
    int i;
    int j;
    void display(){
        super.i = j+1;
        System.out.println(j+" "+ i);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
}