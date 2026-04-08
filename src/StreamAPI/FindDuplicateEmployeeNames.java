package StreamAPI;

import StreamAPI.models.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateEmployeeNames {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Alice", "HR", 50000D),
                new Employee("Eve", "HR", 452300D)
        );

        Set<String> seen = new HashSet<>();

        Set<String> dupes =
                employees.stream()
                        .map(Employee::getName)
                        .filter(name -> !seen.add(name))
                        .collect(Collectors.toSet());

        System.out.println(dupes);
    }
}
