package StreamAPI;

import java.util.List;

// Skip Last N elements

public class SkipLastNElements {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 5, 1, 2, 3, 4, 5);

        List<Integer> elements = nums
                .stream()
                .sorted()
                .skip(2)
                .toList();

        System.out.println("Skip Last N Elements :: " + elements);
    }
}
