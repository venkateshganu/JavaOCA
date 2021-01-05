package ErrorsAndExceptions.Errors;

class Base {
    public void log() throws RuntimeException {
        System.out.println("Base: log()");
    }
}

class Derived extends Base {
    public void log() throws NullPointerException {
        System.out.println("Derived: log()");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.log();
    }
}