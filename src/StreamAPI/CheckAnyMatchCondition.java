package StreamAPI;

import java.util.List;

// Check if any match a condition
public class CheckAnyMatchCondition {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 8, 6, 9, 7, 1, 0);

        boolean anyGreater = nums.stream()
                .anyMatch(n -> n > 3);


        System.out.println("Any Matching The Condition  :: " + anyGreater);
    }
}
