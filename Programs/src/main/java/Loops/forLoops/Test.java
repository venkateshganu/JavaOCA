package Loops.forLoops;

public class Test {

    static int num = 10;

    public void PrintThis(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        Test a = new Test();
        a.PrintThis();
        a.num = 20;
        a.PrintThis();
    }
}
