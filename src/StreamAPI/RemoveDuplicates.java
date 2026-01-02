package StreamAPI;

// Remove Duplicates

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 202, 72, 8, 14, 745, 8, -6, 2, 5, 2, 8);

        List<Integer> unique = nums.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("Unique Elements :: " + unique);
    }
}
