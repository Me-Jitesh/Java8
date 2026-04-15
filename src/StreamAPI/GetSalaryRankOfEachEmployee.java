package StreamAPI;

import StreamAPI.data.EmployeeDB;
import StreamAPI.models.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class GetSalaryRankOfEachEmployee {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDB.getEmployees();

        AtomicInteger rank = new AtomicInteger(1);

        Map<Employee, Integer> result =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .collect(Collectors.toMap(
                                e -> e,
                                e -> rank.getAndIncrement(),
                                (a, b) -> a,
                                LinkedHashMap::new
                        ));

        System.out.println(result);
    }
}
