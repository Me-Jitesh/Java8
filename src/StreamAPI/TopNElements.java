package StreamAPI;

import java.util.Comparator;
import java.util.List;


// Top N elements

public class TopNElements {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 5, 1, 2, 3, 4, 5);

        List<Integer> elm = nums
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .toList();

        System.out.println("Top N Elements :: " + elm);
    }
}
