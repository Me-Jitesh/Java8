package StreamAPI;

import java.util.List;

// Skip N elements

public class SkipNElements {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 5, 1, 2, 3, 4, 5);

        List<Integer> elements = nums
                .stream()
                .skip(2)
                .toList();

        System.out.println("Skip N Elements :: " + elements);
    }
}
