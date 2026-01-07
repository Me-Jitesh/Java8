package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Partitioning By Condition
public class PartitioningByCondition {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 202, 72, 8, 14, 745, 8, 6, 2, 5, 2, 8);

        Map<Boolean, List<Integer>> even = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        even.forEach((key, val) -> {
            System.out.println("PARTITION BY :: " + "IS EVEN  = " + key + " VALUES = " + val.stream().sorted().toList());
        });
    }

}
