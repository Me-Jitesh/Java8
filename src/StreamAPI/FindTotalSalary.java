package StreamAPI;

import StreamAPI.models.Employee;

import java.util.List;

public class FindTotalSalary {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", 90000D),
                new Employee("Bob", "Marketing", 60000D),
                new Employee("Charlie", "Engineering", 85000D),
                new Employee("Diana", "Marketing", 70000D),
                new Employee("Eve", "HR", 50000D)
        );

        double total = employees
                .stream()
                .filter(e -> e.getDept().equals("Engineering"))
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(total);

    }
}
