package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group by string length

public class GroupByStringLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Vandu", "Avinya", "Aaryash");

        Map<Integer, List<String>> map = names
                .stream()
                .collect(Collectors.groupingBy(String::length));

        map.forEach((len, list) -> {
            System.out.println("Length :: " + len + " Names :: " + list);
        });
    }

}
