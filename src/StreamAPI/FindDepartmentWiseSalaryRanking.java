package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDepartmentWiseSalaryRanking {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        Map<String, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .collect(Collectors.toList())
                                )
                        ));
        
        System.out.println(result);
    }
}
