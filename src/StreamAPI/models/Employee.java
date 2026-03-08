package StreamAPI.models;

public class Employee {

String name;
String dept;
Integer salary;

    public Employee(String dept, String name,Integer salary) {
        this.dept = dept;
        this.salary = salary;
        this.name = name;
    }
}
