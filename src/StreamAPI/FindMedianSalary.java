package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class FindMedianSalary {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        List<Double> salaries =
                employees.stream()
                        .map(Employee::getSalary)
                        .sorted()
                        .collect(Collectors.toList());

        double median;
        int size = salaries.size();

        if (size % 2 == 0) {
            median = (salaries.get(size / 2 - 1) + salaries.get(size / 2)) / 2;
        } else {
            median = salaries.get(size / 2);
        }
        System.out.println(median);
    }
}
