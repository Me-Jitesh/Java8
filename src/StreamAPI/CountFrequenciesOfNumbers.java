package StreamAPI;

// Count frequencies of numbers

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequenciesOfNumbers {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 5, 1, 2, 3, 5, 1, 2, 5, 2, 3, 1, 1, 6, 5, 6, 8, 8, 8, 8);

        Map<Integer, Long> freq = nums
                .stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        freq.forEach(
                (num, count) -> System.out.println("Num = " + num + " Has Count = " + count)
        );

    }
}
