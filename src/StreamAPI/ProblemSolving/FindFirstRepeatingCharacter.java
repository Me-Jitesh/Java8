package StreamAPI.ProblemSolving;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstRepeatingCharacter {

    public static void main(String[] args) {

        String str = "HelloWorld";

        Character firstRepeat =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);


        System.out.println("First Repeated Char Is :: " + firstRepeat);
    }
}
