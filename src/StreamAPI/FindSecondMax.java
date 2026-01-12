package StreamAPI;

import java.util.Comparator;
import java.util.List;

// Find 2nd maximum number
public class FindSecondMax {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int secondMax = nums
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("2nd Max Number is :: " + secondMax);
    }
}
