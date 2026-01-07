package StreamAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Skip And Limit
public class SkipAndLimit {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 202, 72, 8, 14, 745, 8, -6, 2, 5, 2, 8);

//        List<Integer> result = nums.stream()
//                .skip(1)       // skip first
//                .limit(3)      // take next 3
//                .collect(Collectors.toList());

        List<Integer> result = nums.stream()
                .skip(1)       // skip first
                .limit(3)      // take next 3
                .toList();


        System.out.println("Skip And Limit :: " + result);

    }

}
