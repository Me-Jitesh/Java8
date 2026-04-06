package StreamAPI;

import StreamAPI.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeesBasedOnSalaryLarger50k {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        Map<Boolean, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));

        System.out.println(result);
    }
}
