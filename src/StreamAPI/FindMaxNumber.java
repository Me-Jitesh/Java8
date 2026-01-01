package StreamAPI;

// Find maximum number

import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

//        int max = nums
//                .stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .orElse(0);

        int max = nums
                .stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println("Max Number is :: " + max);
    }
}
