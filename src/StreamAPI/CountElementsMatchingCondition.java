package StreamAPI;

import java.util.List;

// Count elements matching a condition

public class CountElementsMatchingCondition {

    public static void main(String[] args) {

        List<Integer> nums = List.of(125, 28, 338, 48, 0, 5, 6, 2, 5);

        long count = nums.stream()
                .filter(n -> n > 3)
                .count();

        System.out.println(count);
    }
}
