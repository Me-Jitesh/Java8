package StreamAPI.ProblemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostRepeatedElement {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11, 21, 33, 125, 54, 4512, 11, 91, 17,33,11,125,21,33,91,52);

        Integer mostRepeated =
                nums.stream()
                        .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println("Most Repeated :: " + mostRepeated);
    }
}
