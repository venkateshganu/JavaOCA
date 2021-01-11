package ErrorsAndExceptions;

public class UnreachableCode {
    public static void main(String[] args) {
        try{

        }
        catch(NullPointerException e1){
            System.out.println(e1);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
    }
}
