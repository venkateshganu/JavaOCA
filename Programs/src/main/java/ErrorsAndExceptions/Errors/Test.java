package ErrorsAndExceptions.Errors;

public class Test {
    private static void test() throws Exception {
        throw new Exception();
    }

    public static void main(String [] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("GAME ON");
        }
    }
}
