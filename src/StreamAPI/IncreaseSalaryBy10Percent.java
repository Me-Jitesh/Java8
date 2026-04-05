package StreamAPI;

import StreamAPI.models.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSalaryBy10Percent {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        List<Employee> result =
                employees.stream()
                        .peek(e -> e.setSalary(e.getSalary() * 1.1))
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
