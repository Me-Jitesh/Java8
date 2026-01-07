package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group By Property
public class GroupByProperty {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apricot", "kiwi", "orange", "lemon", "grapes", "papaya", "berry", "pomegranate", "pineapple", "mango");

        Map<Character, List<String>> grouped =
                fruits
                        .stream()
                        .collect(Collectors.groupingBy(s -> s.charAt(0)));

        grouped.forEach((key, val) -> {
            System.out.println("Grouped As :: " + "Key = " + key + " Value = " + val);
        });
    }

}
