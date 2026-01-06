package StreamAPI;

import java.util.List;

// Check if all match a condition
public class CheckAllMatchingACondition {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 8, 6, 9, 7, 1, 0);

        boolean allMatch = nums.stream()
                .allMatch(n -> n > 10);


        System.out.println("All Matching The Condition  :: " + allMatch);
    }
}
