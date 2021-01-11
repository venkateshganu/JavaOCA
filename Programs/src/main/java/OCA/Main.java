package OCA;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
        employee.salary = 2_00_000;
//        manager.budget = 50_000;
        director.salary = 100000;
    }
}
