package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Sum Using Reduce
public class Reduce {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 202, 72, 8, 14, 745, -8, 6, 2, 5, 2, 8);

//        Integer sum = nums.stream()
//                .reduce(0, (a, b) -> a + b);

        Integer sum = nums.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum Using Reduce :: " + sum);

    }

}
