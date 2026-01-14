package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// All distinct chars from strings

public class AllDistinctCharsFromStrings {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Vandu", "Avinya", "Aaryash");

        Set<Character> chars = names.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toSet());

        System.out.println(chars);
    }

}
