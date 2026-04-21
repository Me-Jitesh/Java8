package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeesSortedByDeptThenSalaryDesc {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        List<Employee> result =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getDept)
                                .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
