package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmployeesWithSameSalary {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        Map<Double, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getSalary))
                        .entrySet().stream()
                        .filter(e -> e.getValue().size() > 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }
}
