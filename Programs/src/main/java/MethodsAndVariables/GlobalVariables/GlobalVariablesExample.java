package MethodsAndVariables.GlobalVariables;

public class GlobalVariablesExample {
    public String username;
    public String password;
    public static void main(String[] args) {
        GlobalVariablesExample gv = new GlobalVariablesExample();
        System.out.println(gv.username);
        System.out.println(gv.password);
    }
}
