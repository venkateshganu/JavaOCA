package SubClasses;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {


        //Reusing same piece of code from parent class

        //Method 1 - Create an object and call the method
        ChildClass a = new ChildClass();
        System.out.println(a.getDiff(5,10));

        ParentClass b = new ChildClass();
        System.out.println(b.getDiff(5,10));

        ParentClass c = new ParentClass();
        System.out.println(c.getDiff(5,10));

        //Method 2 - If it is static
        int x = 5;
        int y=10;
        System.out.println(ParentClass.getSum(5,10));




    }
}
