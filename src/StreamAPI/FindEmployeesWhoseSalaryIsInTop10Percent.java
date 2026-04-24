package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeesWhoseSalaryIsInTop10Percent {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        List<Double> sorted =
                employees.stream()
                        .map(Employee::getSalary)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        double threshold =
                sorted.get((int) (0.1 * sorted.size()));

        List<Employee> result =
                employees.stream()
                        .filter(e -> e.getSalary() >= threshold)
                        .collect(Collectors.toList());

        System.out.println(result);
    }

}
