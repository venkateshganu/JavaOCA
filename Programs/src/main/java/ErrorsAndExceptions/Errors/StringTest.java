package ErrorsAndExceptions.Errors;

public class StringTest {
    static String str = "KEEP IT "; //Line n1
    public static void main(String[] args) {
        String str = "";
        str = str + "SIMPLE"; //Line n2
        System.out.println(str);
    }
}