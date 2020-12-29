package ErrorsAndExceptions.Errors;

public class ExceptionInInitializerError {
    static {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
