package Constructors;

public class Employee {

    int salary;
    int age;
    String name;
    int $;
    int _;

    Employee(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String toString(){
        return name+age+salary;
    }

    public boolean equals(Employee e){
        return salary == e.salary && age == e.age;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("john",10,5000);
        Employee e2 = new Employee("john",10,5000);
        System.out.println(e1.equals(e2));
    }
}
