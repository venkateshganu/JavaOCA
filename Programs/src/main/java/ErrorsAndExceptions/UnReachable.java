package ErrorsAndExceptions;

public class UnReachable {
    public void bad() {
        eatCarrot();
    }
    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
    private static void eatCarrot() { }


    public static void main(String[] args) {

    }
}
