package StreamAPI;

import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetEmployeeNameSortedBySalary {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        List<String> names =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                        .map(Employee::getName)
                        .collect(Collectors.toList());

        System.out.println(names);
    }
}
