package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEmployeesEarningAboveDepartmentAverage {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        Map<String, Double> avgMap =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        List<Employee> result =
                employees.stream()
                        .filter(e -> e.getSalary() > avgMap.get(e.getDept()))
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
