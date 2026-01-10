package StreamAPI;

// Sort a list in Reverse Order

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseSort {

    public static void main(String[] args) {

        List<Integer> nums = List.of(-5, 202, 72, 8, 14, 745, -88, -6, 2, 5, 2, 8);

        List<Integer> desc = nums
                .stream()
                .sorted(Collections.reverseOrder())
//                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reversed Sorted List  :: " + desc);
    }
}
