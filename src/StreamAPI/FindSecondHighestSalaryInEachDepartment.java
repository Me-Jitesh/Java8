package StreamAPI;

StreamAPI StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class FindEmployeeCountByDepartment {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        Map<String, Optional<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()

.sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .skip(1)
                                                .findFirst()
                                )
                        ));
        System.out.println(result);
    }

}
