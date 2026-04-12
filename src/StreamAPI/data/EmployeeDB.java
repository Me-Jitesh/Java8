package StreamAPI.data;

import StreamAPI.models.Employee;

import java.util.List;

public class EmployeeDB {

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee("Alice", "Engineering", 90050D),
                new Employee("Bob", "Marketing", 60008D),
                new Employee("Charlie", "Engineering", 85800D),
                new Employee("Alice", "HR", 1506D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 5002D)
        );
    }
}
