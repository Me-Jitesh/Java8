package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Count By Property
public class CountByProperty {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apricot", "kiwi", "orange", "lemon", "grapes", "papaya", "berry", "pomegranate", "pineapple", "mango");

        Map<Character, Long> freq =
                fruits
                        .stream()
                        .collect(
                                Collectors.groupingBy(s -> s.charAt(0), Collectors.counting())
                        );

        freq.forEach((key, val) -> {
            System.out.println("Frequency Of :: " + "Start With  = " + key + " Count = " + val);
        });
    }

}
