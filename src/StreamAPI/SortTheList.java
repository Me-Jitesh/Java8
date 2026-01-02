package StreamAPI;

// Sort a list

import java.util.List;
import java.util.stream.Collectors;

public class SortTheList {

    public static void main(String[] args) {

        List<Integer> nums = List.of(-5, 202, 72, 8, 14, 745, -88, -6, 2, 5, 2, 8);

        List<Integer> sorted = nums.stream()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Min Number is :: " + sorted);
    }
}
