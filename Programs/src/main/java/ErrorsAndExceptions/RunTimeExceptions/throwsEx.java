package ErrorsAndExceptions.RunTimeExceptions;

public class throwsEx {

//    public void fun1() throws Exception{
//        throw new Exception();
//    }

    public void fun2(){
    try{
        System.out.println("this function");
        System.exit(0);
    }
    finally{
        System.out.println("Must be avoided");
    }
    }
    public static void main(String[] args) throws Exception {
        throwsEx t1 = new throwsEx();
        t1.fun2();
    }
}
