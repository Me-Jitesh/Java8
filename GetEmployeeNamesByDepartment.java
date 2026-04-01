package StreamAPI;

import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.*;


public class FindEmployeeCountByDepartment {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        Map<String, List<String>> result =
employees.stream().collect(
Collectors.groupingBy(
Employee::getDept,
Collectors.mapping(Employee::getName, Collectors.toList())
));

        System.out.println(result);
    }

}
