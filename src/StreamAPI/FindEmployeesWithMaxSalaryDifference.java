package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.List;

public class FindEmployeesWithMaxSalaryDifference {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        Double diff =
                employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .summaryStatistics()
                        .getMax() - employees.stream()
                        .mapToDouble(Employee::getSalary)
                        .summaryStatistics()
                        .getMin();

        System.out.println(diff);
    }
}
