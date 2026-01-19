package StreamAPI;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Find duplicate elements in a list

public class FindDuplicateElementsInList {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 5, 1, 2, 3, 4, 5, 3);

        Set<Integer> duplicates =
                nums
                        .stream()
                        .filter(n -> Collections.frequency(nums, n) > 1)
                        .collect(Collectors.toSet());


        System.out.println("Skip Last N Elements :: " + duplicates);
    }
}
