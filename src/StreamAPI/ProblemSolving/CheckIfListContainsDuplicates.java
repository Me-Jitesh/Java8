package StreamAPI.ProblemSolving;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckIfListContainsDuplicates {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 20, 50, 80, 85, 99, 37, 73, 55, 10);

        boolean hasDupes = nums.size() != nums.stream().distinct().count();

        System.out.println("Has Duplicates :: " + hasDupes);
    }
}
