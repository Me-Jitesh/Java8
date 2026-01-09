package StreamAPI;

// Find Average

import java.util.List;

public class FindAverage {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 5, 1, 2, 3, 4, 5);

        double avg = nums
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Of Numbers is :: " + avg);
    }
}
