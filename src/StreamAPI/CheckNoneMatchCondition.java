package StreamAPI;

import java.util.List;

// Check if none match a condition
public class CheckNoneMatchCondition {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 8, 6, 9, 7, 1, 0);

        boolean noneMatch = nums.stream()
                .noneMatch(n -> n > 3);


        System.out.println("None Matching The Condition  :: " + noneMatch);
    }
}
