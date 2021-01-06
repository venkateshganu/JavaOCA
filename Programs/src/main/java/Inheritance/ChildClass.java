package Inheritance;

class ParentClass{
}

public class ChildClass extends ParentClass{


    public static void main(String args[]){

        ParentClass p1 = new ParentClass();

        ParentClass p2 = new ChildClass();

        ChildClass c1 = new ChildClass();

        ParentClass p3 = c1; //Shorter object in longer object
        ChildClass c2 = (ChildClass) p2; //Longer object in shorter object


    }

}


