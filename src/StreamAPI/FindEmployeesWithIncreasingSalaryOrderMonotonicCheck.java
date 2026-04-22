package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class FindEmployeesWithIncreasingSalaryOrderMonotonicCheck {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        boolean isIncreasing =
                IntStream.range(0, employees.size() - 1)
                        .allMatch(i -> employees.get(i).getSalary() <= employees.get(i + 1).getSalary());

        System.out.println(isIncreasing);
    }

}
