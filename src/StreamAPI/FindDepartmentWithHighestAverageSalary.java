package StreamAPI;

import StreamAPI.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDepartmentWithHighestAverageSalary {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        String dept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.averagingDouble(Employee::getSalary)
                        ))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .get().getKey();

        System.out.println(dept);
    }
}
