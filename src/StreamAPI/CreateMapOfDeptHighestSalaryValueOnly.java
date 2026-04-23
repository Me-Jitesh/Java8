package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMapOfDeptHighestSalaryValueOnly {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        Map<String, Double> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                        e -> e.get().getSalary()
                                )
                        ));

        System.out.println(result);
    }

}
