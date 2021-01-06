package Variables;

public class StaticVariables {
    static int num = 10;

    public static void main(String[] args) {

        StaticVariables sv1 = new StaticVariables();
        sv1.num = 20;
        System.out.println(num);

    }
}
