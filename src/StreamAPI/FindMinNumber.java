package StreamAPI;

// Find minimum number

import java.util.List;

public class FindMinNumber {

    public static void main(String[] args) {

        List<Integer> nums = List.of(-5, 1, 2, 3, 4, 5);

//        int max = nums
//                .stream()
//                .mapToInt(Integer::intValue)
//                .min()
//                .orElse(0);

        int max = nums
                .stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println("Min Number is :: " + max);
    }
}
