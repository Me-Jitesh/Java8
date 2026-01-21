package StreamAPI.ProblemSolving;

import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacter {

    public static void main(String[] args) {

        String str = "HelloWorld";

        Map<Character, Long> freq =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        freq.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
