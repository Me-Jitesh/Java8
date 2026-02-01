package StreamAPI.ProblemSolving;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWithDigit1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 21, 33, 125, 54, 4512, 11, 91, 17);

        List<Integer> result =
                nums.stream()
                        .filter(n -> String.valueOf(n).startsWith("1"))
                        .toList();

        System.out.println(result);
    }
}
