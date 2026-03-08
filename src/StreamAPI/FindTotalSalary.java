package StreamAPI;

import StreamAPI.models.Employee;

import java.util.List;

public class FindTotalSalary {
    List<Employee> employees = List.of(
            new Employee("Alice", "Engineering", 90000),
            new Employee("Bob", "Marketing", 60000),
            new Employee("Charlie", "Engineering", 85000),
            new Employee("Diana", "Marketing", 70000),
            new Employee("Eve", "HR", 50000)
    );

    double total = employees.stream()
            .filter(e -> e.dept().equals("Engineering"))
            .map(Employee::getSalary)
            .reduce(0.0, Double::sum);

}
